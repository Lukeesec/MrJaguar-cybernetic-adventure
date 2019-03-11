# Here is the problem
Admin made a new website but doesn't seem to have the admin password. Gives a link to the website.
At first glance theres a login, logging in with admin as the username returns "I'm sorry but your're not getting
in that way" Logging in with anything else works. Once logged in you'll see "No flag for you" in the middle of the
screen. Then right above that saying "Not sure you'll be able to see the flag though"

# How I solved it
Went looking through the website in inspect mode. I then stumbled apon cookies and found that there was a cookie
nameed admin. With the value of "false". I then changed it to true and reloaded the website. 

# Flag 
picoCTF{l0g1ns_ar3nt_r34l_aaaaa17a}

