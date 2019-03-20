# Problem
Can you deal with the Duck Web? Get us the flag from this program

# Solution
This reverse challenge was yet another really hard one, I've only just started maybe 2 weeks ago.
So I don't know certain basics that could've made this easier.  
I first ran the program and got the output "You have now entered the Duck Web, and you're in for a honkin' good time.
Can you figure out my trick?" After entering in a input I got the output "That's all folks.", next I used radare2 to debug the program, I found a function named "sym.do_magic", after inspecting 
the function I found that to win the program you have to pass a test and make a local_1ch  equal to 25. To make the local_1ch equal to 25, we need to pass a test that compares two strings and if the strings are the same then we will jump to a instruction that adds 1 to local_1ch. After searching more I found a loop, the amount of times the forloop loops is determined by how many chars I entered in
at the program start. So if I entered in LU then the program would run through once normally then loop twice and exit, so the way to win is enter in the "right" 24 chars so it passes the cmp test and jumps to the instruction that adds 1 to local_1ch.  

# Flag
picoCTF{qu4ckm3_35246994}
