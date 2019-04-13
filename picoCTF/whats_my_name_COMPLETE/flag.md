# Problem
Say my name, say my name

# Solution
I was given a link to download, the file given was a pcap file. First then I did was use wireshark and see what was going on, I did not understand most of it. After doing that I just used the command,
(strings myname.pcap | grep -oE picoCTF{.*}), hoping for it to be in the strings, and it was. 

# Flag
picoCTF{w4lt3r_wh1t3_033ad0f914a0b9d213bcc3ce5566038b}

