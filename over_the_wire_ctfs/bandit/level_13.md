# Problem
The password for the next level is stored in /etc/bandit_pass/bandit14 and can only be read by user bandit14. For this level, you don’t get the next password, but you get a private SSH key that can be used to log into the next level

# Solution
There's a file called sshkey.private which contains a ssh. You use it to connect to bandit14, ssh -i sshkey.private bandit14@localhost.

# Password/answer
There's no password for this level
