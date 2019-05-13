# The problem is
Let's start off simple, can you overflow the right buffer in this program to get the flag?
P.S, This all needs to be done on the pico Shell

# How I solved it
I first downloaded both the files provided and made vuln a exe. Tried running it and came up with the error. "No flag file ect ect"
I figured out that I need to run this all on the pico shell. So I went over to their shell and the cd they wanted me to be at.
I ran the program again and got the output "No arg given" So I ran the file again but I gave them a arg. './vuln a' I got the
output 'Thanks! Received`. Finally I entered in enough chars (30) to create a buffer overflow. 

# Flag
picoCTF{ov3rfl0ws_ar3nt_that_bad_a54b012c}
