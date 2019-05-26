# Problem
 Can you decrypt the message? 

# Solution
The encrypted text was encrypted by Fernet; I wrote a small python script to decrypt the encrypted data. Small explaintion taken from a github user named "Tamher", "Conceptually, fernet takes a user-provided message (an arbitrary sequence of bytes), a key (256 bits), and the current time, and produces a token, which contains the message in a form that can't be read or altered without the key.

To facilitate convenient interoperability, this spec defines the external format of both tokens and keys.

All encryption in this version is done with AES 128 in CBC mode.

All base 64 encoding is done with the "URL and Filename Safe" variant, defined in RFC 4648 as "base64url"."