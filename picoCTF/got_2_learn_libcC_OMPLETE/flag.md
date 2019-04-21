# Problem
This program gives you the address of some system calls. Can you get a shell?

# Solution
This challenge may be a little hard to explain, so bare with me.
The challenge provides 2 files, a .c file and a exe that was compiled from the .c file.
If you look into the .c file you will see a useful_string var that contains "/sh/bin" as the string, after that you'll see gets, and as we all know,
gets is exploitable. After looking into the .c file, I checked out the exe, running it will give the output "useful addresses", and 5 addresses, puts,fflush,read,write,useful_string;
the exe will also ask you to enter something, and that's how we will exploit the exe.

Now to get to exploiting the exe, first I check the buffer size with "cyclic 1000 | ./vuln && dmesg | grep vuln", i'll grab the last address and use "cyclic -i address", doing that will give us 
the buffer size (160). Everytime the exe is ran, the address's change due to ASLR, so this challenge will be a little harder. We need to find a libc func (system), and we wont be able to find it unless we find the offset of system and puts. So all you need to do is go to this site "https://libc.blukat.me/?q=__libc_start_main_ret%3Ae81%2C_IO_2_1_stdin_%3A5c0": you need to have the right libc version, if you dont then the exploit wont work. Enter in the last three digits of
puts,fflush, and read. Then click find, you shhould see two matches, just click either one, once that is done just click puts and it will tell us the offset to get to system. Once you have the offset you can use it in the get_flag.py script.


# Flag
picoCTF{syc4al1s_4rE_uS3fUl_a78c4d87}
