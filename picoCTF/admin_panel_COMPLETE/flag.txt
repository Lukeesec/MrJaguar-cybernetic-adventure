# The problem is
We captured some traffic logging into the admin panel, can you find the password?

# How I solved it
I downloaded the file, found that it had the extension '.pcap'; did some googling. Figured out that 
the extension '.pcap' is made by using 'Npcap' which is used to capture packets travelling over a network, and it also encrypts the data.
So I googled some more and figured out how to decrypt the data using 'tcpick'; I made sure to pipe
it to grep with the keywords picoCTF. 

# Flag
picoCTF{l0g1ns_ar3nt_r34l_aaaaa17a}
