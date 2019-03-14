# Problem
Okay now you're cooking! This time can you overflow the buffer and return to the flag function in this program?

# Solution
Ahh, so this one was a hard one for me. I spent 2 days just reading up on assembly and watching liveoverflow, if anything helped me it was the youtube channel liveoverflow. His binary series explained almost
everything I needed to solve this problem. First I used radare2 to debug the file, what we want to do is corrupt the return address in the vuln function and change it to the win address. 

I started by running the file and entering in a bunch of A's and once I pushed enter it would show the current return address.. I entered in around 50 A's so the return address was full of 41's, I overflowed
the return address with a bunch of A's (hex value 41). Now to find exactly how many chars will overflow the program, and that value is 44. Next part is to grab the win address and put that at the end of the 44
A's. Well this is where I was wrong, I needed to first use pwntools, to convert the win address to little endian since that's how a cpu reads data. Snippit **from pwn import * p32(win address)** that will
give is the little endian version of the return address. Next thing to do is use python to pipe 44 A's and the little endian version of the win address to the program. The code for that is --
**python -c "print 'AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA' + '\xcb\x85\x04\x08' " | ./vuln**

# Flag
picoCTF{addr3ss3s_ar3_3asy56a7b196}
