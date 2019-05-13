# Problem
The credentials for the next level can be retrieved by submitting the password of the current level to a port on localhost in the range 31000 to 32000. First find out which of these ports have a server listening on them. Then find out which of those speak SSL and which don’t. There is only 1 server that will give the next credentials, the others will simply send back to you whatever you send to it.

# Solution
First we need to find a active port, I used nmap to do this; nmap -sV -vv -p 31000-32000 localhost. Once we find the active port we just need to grab the password for the current level, and we need to use
openssl to connect to the port. cat /etc/bandit_pass/bandit16 | openssl s_client -connect localhost:31790 -quiet, that will give us a ssh to use to connect to bandit17 like we did in bandit13. We can make a
tmp dir in /tmp/mykey, then we can make a file and paste in the ssh key, nano /tmp/mykey/sshkey, after that we need to give it "safer" perms, so we use the cmd chmod 600 /tmp/mykey/sshkey. After that
all we need to do is connect to bandit17 using the sshkey, ssh -i pathway_to_key bandit17@localhost. 

# Password/answer
No password.
