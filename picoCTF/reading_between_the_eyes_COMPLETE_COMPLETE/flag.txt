# Here is the problem
Stego hid a message in a image. Can you retreive it?

# How I solved it
I checked the hint provided, "Maybe there's a online decoder". I then started to search
for png decoders.. Found a base64 png decoder, and tried decoding. I got a few flag parts; but it 
was all over the place. So I searched more then reliased that "stego" is a
name of a "type of decoder" and theres a library for it. "gem install zsteg" From 
there I ran the command "zsteg husky.png"

# Flag
picoCTF{r34d1ng_b37w33n_7h3_by73s}


