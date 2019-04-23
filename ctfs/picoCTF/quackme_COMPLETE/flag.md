# Problem
Can you deal with the Duck Web? Get us the flag from this program

# Solution
This reverse challenge was yet another really hard one, I've only just started maybe 2 weeks ago.
So I don't know certain basics that could've made this easier.  
I first ran the program and got the output "You have now entered the Duck Web, and you're in for a honkin' good time.
Can you figure out my trick?" After entering in a input I got the output "That's all folks.", next I used radare2 to debug the program, I found a function named "sym.do_magic", after inspecting 
the function I found that to win the program you have to pass a test and make a local_1ch  equal to 25. To make the local_1ch equal to 25, we need to pass a test that compares two strings and if the strings are the same then we will jump to a instruction that adds 1 to local_1ch. After searching more I found a loop, the amount of times the forloop loops is determined by how many chars I entered in
at the program start. So if I entered in LU then the program would run through once normally then loop twice and exit. To win you need to write down the value of eax before the 'xor' instruction, and do that 24 times then xor that data with the greeting messaged (converted to hex). I know this doesn't make much sense, there's a load of better writeups but this is just to explain how I did it.  

The exploit.py just takes the greeting message and the xor data (obj.sekrutbuffer), then xor's it and stores it in "flag", then once the loop ends; prints flag.
# Flag

picoCTF{qu4ckm3_35246994}
