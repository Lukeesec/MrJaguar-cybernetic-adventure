# Solution 
I've used foremost on all the images, the only image that had something was monalisa; I found a zip file named famous that is locked. I used eog to see what thepassword_is... is, I saw the name TOM on a guys head, I then used "steghide extract -sf" on thepassword_is.. & I used the pass TOM. I received a file with a MD5 hash, I used a decrypter and got the key leonardo.

I used the key to unzip famous.zip, from that I got a jpg, mona, it was a picture of monalisa with a phone and bigger lips. We can then use steghide extract -sf file -p Guernica; we will receive a key file. Inside the file is "VTBaU1EyVXdNSGRpYTBKbVZFUkdObEZHT0doak1UbEZUVEJDUldaUlBUMD0=", which is a base64 encryption, its been encrypted 4 times, so I used a base64 decrypter 4 times and got the flag.

# Useful commands
unziper for .zp
unzip 

unziper for .gz
gunzip

analyzer
foremost

zip cracker
fcrackzip -u -D -p wordlist file

stegcracker
cracks jpgs

steghide extract -p passphrase file

