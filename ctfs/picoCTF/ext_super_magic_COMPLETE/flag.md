# Problem
We salvaged a ruined Ext SuperMagic II-class mech recently and pulled the filesystem out of the black box. It looks a bit corrupted, but maybe there's something interesting in there

# Solution
This one was hard. I usally check the hints since im new and it just makes life much easier since I still don't know much.
I downloaded the file and used (file) on it and got no info in return, I then tried (fsck) on the file, the command didn't seem to want to work either, So I looked into the hints more and found that I have to do (fsck.ext2). The output of that command pretty much said that my "superblock" was corrupted. 
I had no idea what "superblock" was, so I searched around and found that its a "flag" that tells the system what type of file it is. So from knowning that I figured out that I needed to change the superblock on the ext file. I also found that ext2 is always located at 1080-1081, I then used hexeditor to try and go to that location, I tried many things and was not able to find it. So I searched for the answers on this one, and found a command. (xxd -s $((1024+56)) -l 16 ext-super-magic.img), now all I need to do is edit that line and add 4 chars, the "superblock" so that linux knows what type of file this is. The 4 chars that are needed is (53 EF).
Once I entered in the new chars and saved the file; I did the command debugsf, then I entered in ls, a couple hundred imgs were shown, all we need is the flag.jpg, (dump flag.jpg flag.jpg). After that I just used the command (eog) on the file and the flag was shown at the top middle of the image.

# Flag
picoCTF{B3a388F85f93246B9DBA7Cc0fbBA5eE0}
