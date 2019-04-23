# Problem 
The password for the next level can be retrieved by submitting the password of the current level to port 30000 on localhost.


# Solution
Simiply cd'ed to the dir that containts the password for bandit14 and then used nc to connect to the port 30000 on localhost. echo password | nc localhost 30000, after doing that, the password for the next level will appear.

# Passowrd
BfMYroe26WYalil77FoDi9qh59eK5xNr

# Clarification
The password above was used to connect to level 15, I obtained this password using the password for level 14 to connect to port 30000, which then gave me the password to connect to level 15.
