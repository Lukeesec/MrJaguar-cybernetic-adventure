# Solution
Nmap results showed three open ports, ssh, apache; and node.js. I then ran dirbuster on the two sites and found that the apache site had a helpdesk. The url for it was ip/support, it's a easy to setup helpdesk called 'HelpDeskz', from there I started searching for exploits and ended up finding one on exploit-db pretty fast, '
HelpDeskZ 1.0.2 - Arbitrary File Upload'.

Here's a small copy and past from exploit-db
```
HelpDeskZ = v1.0.2 suffers from an unauthenticated shell upload vulnerability.

The software in the default configuration allows upload for .php-Files ( !! ). I think the developers thought it was no risk, because the filenames get obfuscated when they are uploaded. However, there is a weakness in the rename function of the uploaded file

controllers httpsgithub.comevolutionscriptHelpDeskZ-1.0tree006662bb856e126a38f2bb76df44a2e4e3d37350controllerssubmit_ticket_controller.php - Line 141
$filename = md5($_FILES['attachment']['name'].time())...$ext;

So by guessing the time the file was uploaded, we can get RCE.

Steps to reproduce

httplocalhosthelpdeskzv=submit_ticket&action=displayForm

Enter anything in the mandatory fields, attach your phpshell.php, solve the captcha and submit your ticket.

Call this script with the base url of your HelpdeskZ-Installation and the name of the file you uploaded

exploit.py httplocalhosthelpdeskz phpshell.php
```
A clearer way of reproducing, get php-reverse-shellcode, go to the support part of the site and click submit a ticket, fill out all the needed information and upload the file. Then setup a listener & run the exploit, 'python exploit.py ip/support/uploads/tickets/ filename'. It make take a few moments for the exploit to guess the filename but once it does you'll see that a backdoor opened up in your listener.

Okay, we have user, now to get root. I was not able to get any enum scripts to properly run on the machine, so I started going through some basic commands, one of the first were 'uname -a', it showes kernal version. The kernal version was outdated so I searched searchsploit and found an exploit to use. I just setup a SimpleHTTPServer and used wget to grab the file from my local command and transfer to the backdoor I created. I then compiled the file and ran it, new id was root. 



