# Radare2
**Cheat sheet https://scoding.de/uploads/r2_cs.pdf*

How to use radare2. First you can use it by entering in "r2 filename" to go into normal mode, and if you want to go into debugger mode "r2 -d filename". I'll be talking about the normal mode first. Once you've typed the command you should type "aaa" to anaylyze the code; and after that type "s main" to seek to the main address, and to view the code type "pdf". If you want to view the code in visual mode type "VV"; which will show a control graph of the code, you can navigate the graph with the arrow keys. to leave the visual mode just press "q". To show the help menu and see all the options and things that can be done in this mode just press "shift and question mark"

Now to go over the debug mode. Pretty much the same process, once in debug mode use the cmd "s main" to seek to the main function (instruction set) after that enter in "aaa" to analyze the code, and pdf to show main function. To place a break point enter in "db" and the address you want to start at. Now to debug the program go in to visual mode "VV", once .n visual mode you can use "shift colon" to be able to enter in commands. Once in "command mode" enter in "dc" to start the debugger.

I know the above info is not super useful, but it's really to get just get started, there are a load of docs on how to use r2. 
From now on i'm just going to take notes of useful commands in r2.

# Useful commands
instead of typing VV whilst in r2 debug mode try v!, its a much "fancy" version of VV, it will show registers,the stack, stack_refs, 
and a load of other useful info.
