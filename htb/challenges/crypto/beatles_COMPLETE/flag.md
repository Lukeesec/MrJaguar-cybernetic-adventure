# Problem


# Solution
get_flag.sh script.

Unziped the file and got two more files, a zip file called BAND.zip & message for paul, the message for paul had encrypted txt, so I made a guess and used quip quip to decode.
```
Hey Paul, My Folder has passphrase with four (4) characters. Could you fcrac? it for me??? I send you a message for our Tour ne?t month... Don't Share it with other members of our band... -?ohn Lennon PS: Peace and Love my friend... Beatles Band for ever!
```
From reading the message above it hinted towards fcrackzip, so I ended up using fcrack on the BAND.zip, and got the password "pass". I then used the password to unzip the BAND.zip; I got a JPG named BAND. I used the command strings on the file and saw that there was a base64 encoding at the bottom, the cipher text was encrypted twice in base64, after decrypting I got the message "Try Harder!". I then tried a series of stego steps; I ended up finding that there was embedded data that was locked with a paraphrase, I used stegcracker to extract the data.

I got a file named band.jpg.out, it's a exe so I chmoded it and had a fun little challenge given to me, just some simple math, once I entered in all the write things I got a cipher text that was encoded with base64. P.S, just use 'strings -100 file', you'll see the cipher text, just code with base64.
```
The tour was canceled for the following month...!

I'll go out for dinner with my girlfriend named Yoco! ;)

Flag censored
```