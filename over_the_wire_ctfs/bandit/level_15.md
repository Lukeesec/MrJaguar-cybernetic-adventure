# Problem
The password for the next level can be retrieved by submitting the password of the current level to port 30001 on localhost using SSL encryption.

# Solution
First to find the password for the current level which is level15, using ls -la you will see a file named bandit.password, which isn't the correct password;
you need to use the cmd, cat ../../etc/bandit_password/bandit16.bandit15_password, it will display two passwords use the top one. Now, use openssl s_client -connect localhost:30001, to
connect to the ssl, after that just enter in the level password, after that the password for level 16 will be outputted.

# Password
cluFn7wTiGryunymYOu4RcffSxQluehd
