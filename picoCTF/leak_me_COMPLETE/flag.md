# Problem
Can you authenticate to this service and get the flag? Connect with nc 2018shell.picoctf.com 23685.

# Solution
This challenge took some time, reason being is it didn't work locally, the way of cracking the problem was to buffer overflow the 'enter your name'. 
So I entered in 257 chars, 1 over the limit and I didn't receive any output (locally). What should've 
happended was after I entered in 257 chars in I should've gotten the output "password.txt not found" but that wasn't the case. So I spent around 3 
days trying to figure this out, I learned a load of useful info in that time period: null-termination, alot of exploited C functions, and more.

How did I solve it, I just typed in the nc address, entered in 257 chars and received a password, then I entered in the nc address again, and entered in a random name then the password I got from the previous seasion. After entering that password I received the flag.


# Flag
Password - a_reAllY_s3cuRe_p4s$word_a28d9d
Flag - picoCTF{aLw4y5_Ch3cK_tHe_bUfF3r_s1z3_ee6111c9}
