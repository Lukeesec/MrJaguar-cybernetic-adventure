# The problem is
The password for the next level is stored somewhere on the server and has all of the following properties:

owned by user bandit7
owned by group bandit6
33 bytes in size

# How I solved it
I just used the cmd 'find / -size 33c -group bandit6 -user bandit7' To search 
for files with the specific args. Once I found the file path  that had the 
specific args, I just used 'cat' on the file path to get the password

# Password 
HKBPTKQnIay4Fw76bEy8PVxKEDQRKTzs
