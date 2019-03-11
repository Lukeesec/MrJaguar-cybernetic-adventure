# The problem is
The password for the next level is stored in a file somewhere under the inhere directory and has all of the following properties:

human-readable
1033 bytes in size
not executable

# How I solved it
I used the find command and looked for files with the size of 1033c.
I then got shown maybehere07/.file2, So I used the cat command to get 
the password from the file

# CMD
find . -size 1033c

# Password
DXjZPULLxYr17uwoI01bNLQbtFemEgo7

