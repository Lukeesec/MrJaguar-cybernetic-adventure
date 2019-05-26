# Problem
We have got informed that a hacker managed to get into our internal network after pivoiting through the web platform that runs in public internet. He managed to bypass our small product stocks logging platform and then he got our costumer database file. We believe that only one of our costumers was targeted. Can you find out who the customer was?


# Solution
I made a get_flag.sh to solve this challenge, I simiply looked through the file's strings and saw that there was a load of credit card numbers. So I scrolled for a little and noticed how long it was, I then used a cmd to invertedly grep so I can find something that doesn't match the pattern of evertyhing else. From that I was able to get some random string & decode it using CyberChef - Magic.
