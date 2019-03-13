# Problem
You find this when searching for some music, which leads you to be-quick-or-be-dead-1. Can you run it fast enough? 

# Solution
To get the flag I needed to learn how to use radare2 (there's other programs but I like this one the best).
So I opended the binary file with 'r2 filename' and entered in 'aa', after that I used the cmd 's main' to seek to the main instructions.
I found that there was a timer setup so I found the address of the timer and snooped around in there for a bit. I found that after one second the program will exit. So I looked around on the internet and found that using the cmd 'wa nop;nop;nop;nop;nop' at the right address will nop you out of the timer so the program can finish 'making the key'.
I went into edit more and used the cmd 's theaddress' then 'oo+' to go into edit mode, finally I entereted the cmd to 
remove the timer' and re ran the program. The key was shown hurrah



# Commands (Don't usally do this)

rabin2 -I filename (important info about the binary)
rabin2 -z filename (will list all the strings)
rabin2 -zz (will show all strings in the binary(not just the data section))
rabin2 -zqq (will just show strings)

r2 filename (to load our binary into radare2).
run 'aa' (analyizes our binary).
run 's' to seek a spot in memory, the spot we want is 'main'.
Then to go into visual mode just enter in 'v' (radare2's hex editor) Also there's another mode 'VV'.
Also if you want to see the code in assembly just press 'p'.

# Flag
picoCTF{why_bother_doing_unnecessary_computation_27f28e71}
