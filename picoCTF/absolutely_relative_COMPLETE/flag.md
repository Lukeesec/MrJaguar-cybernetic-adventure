# Problem 

# Solution
There is a flaw in the C code, permission.txt is a relative path, so i'm able to make a permission.txt file in the /tmp/dirname, and insert "yes" in the file, then i'm able to go to the folder 
that has the permission.txt file I created, and run the command, "ln -s /problems/absolutely-relative_0_d4f0f1c47f503378c4bb81981a80a9b6/absolutely_relative", which will copy over the absolutely_realative file 
to my current dir, the absolutely_realtive file isn't exactly a copy, its a link to the real file, so when I run the file it's like running it at the original location. After doing that you will receive the flag.

# Flag
picoCTF{3v3r1ng_1$_r3l3t1v3_befc0ce1}

