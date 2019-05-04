# Problem
As you enjoy this music even more, another executable be-quick-or-be-dead-2 shows up. Can you run this fast enough too? 

# Solution
rabin2 -zqq (show all strings)  
readelf -s (show all funcs ect)  
I've been changing what I use to debug, currently I've been using Cutter (made by radare2); it's a great gui debugger, I use it for static debugging. For dyanmic debugging I use GDB-pwndbg, not so amazing for static debugging but I'm still getting to know the apt.  

NOTE: I use pwndbg & to patch in pwndbg I use ed. To change hex to assembly instructions use rasm2 'assembly instruction'. One problem, this will explain it.  
### shows the instruction at address
pwndbg> x/i 0x400815

### shows 4 bytes at address
pwndbg> x/4b 0x400815
0x80 0x10 0x60 0x00

### patch some bytes
pwndbg> ed 0x400815 89f7

### look at the bytes again
pwndbg> x/4b 0x400815
0xf7 0x98 0x00 0x00
### and look at instructions
pwndbg> x/i 0x400815
### wrong instructions are shown

### to fix it you need to invert the data - rasm2 'add rsp,0x28' | rev | sed 's/\(.\)\(.\)/\2\1/g'  
pwndbg> ed 0x400815 f789

### this will still break it because the previous instruction used 4 bytes
### add some nops as padding
pwndbg> ed 0x400815 f7899090
### when you now look at the instructions you see it works
pwndbg> x/3i 0x400815

One more thing to note: you do not need to add padding, from what I've tested, but I could be wrong.

First I opened up the exe given by picoCTF, in cutter; I started debugging it and found there was an alarm that would exit the program in 4 seconds, we want to somehow avoid that. After that we have a get_key that decrypts that flag / calcs the flag, then the last important function we have is a print flag. So far I know there's some xoring going on, and for some reason editing memory causes errors really easy. EDIT: UNFINSIHED WILL REVISE

# Flag

