# Problem
The password for the next level is stored in the file data.txt, which is a hexdump of a file that has been repeatedly compressed. 

# Solution
The hint was thhe file was compressed many times, It didn't compute with me for awhile lol. I used xxd -r filename > data.txt to decode it, then I used file to see what type of file it is.. From there I decompressed the file based on what is was compressed with.

# Password
8ZjyCRiBWFYkneahHwxCv3wb2a1ORpYL


