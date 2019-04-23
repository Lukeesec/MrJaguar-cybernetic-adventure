# Problem
The password for the next level is stored in a file readme in the homedirectory. Unfortunately, someone has modified .bashrc to log you out when you log in with SSH.

# Solution
When you connect to bandit18 it instantly closes and says byebye. We need to read the file readme, so all we need to do is add a command to the end of our ssh cmd. cat readme, once we add that we will get the output of the readme file.

# Password
IueksS7Ubh8G3DCwVzrTd8rAVOwq3M5x
