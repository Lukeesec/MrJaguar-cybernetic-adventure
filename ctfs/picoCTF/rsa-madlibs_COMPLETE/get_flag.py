#!/usr/bin/env python

import pwn
import re
from Crypto.Util.number import inverse

# Note to my self: make separate scripts to make future RSA challenges easier

# Setting up a connection (netcat)
host, port = '2018shell.picoctf.com', 50430
s = pwn.remote(host,port)

# ------------------------------
prompt = s.recv()
prompt = s.recv() 

q = int(re.findall('q : (.*)',prompt)[0])
p = int(re.findall('p : (.*)',prompt)[0])

s.sendline('Y')

prompt = s.recv()
prompt = s.recv()

# To find n, you just need to multiple p and q
s.sendline(str(p * q))


# ------------------------------
prompt = s.recv()
prompt = s.recv()

p = int(re.findall('p : (.*)',prompt)[0])
n = int(re.findall('n : (.*)',prompt)[0])

s.sendline('Y')

prompt = s.recv()
prompt = s.recv()

# n divided by p will equal q
s.sendline(str(n/p))


# ------------------------------
prompt = s.recv()
prompt = s.recv()

e = int(re.findall('e : (.*)',prompt)[0])
n = int(re.findall('n : (.*)',prompt)[0])

s.sendline('N')


# ------------------------------
prompt = s.recv()
prompt = s.recv()

q = int(re.findall('q : (.*)',prompt)[0])
p = int(re.findall('p : (.*)',prompt)[0])

s.sendline('Y')

prompt = s.recv()
prompt = s.recv()

# Find totient(n): from q & p
s.sendline(str((p - 1) * (q - 1)))


# ------------------------------
prompt = s.recv()
prompt = s.recv()

c = int(re.findall('plaintext : (.*)',prompt)[0])
e = int(re.findall('e : (.*)',prompt)[0])
n = int(re.findall('n : (.*)',prompt)[0])

s.sendline('Y')

prompt = s.recv()
prompt = s.recv()

# Figure out what the plaintext is from e & n
s.sendline(str((c**e) % n))


# ------------------------------
prompt = s.recv()
prompt = s.recv()

s.sendline('N')


# ------------------------------
prompt = s.recv()
prompt = s.recv()

q = int(re.findall('q : (.*)',prompt)[0])
p = int(re.findall('p : (.*)',prompt)[0])
e = int(re.findall('e : (.*)',prompt)[0])

s.sendline('Y')

prompt = s.recv()
prompt = s.recv()

# Given q & p & e find d

# Compute phi(n)
phi = (p - 1) * (q - 1)

# Modular inverse 
s.sendline(str(inverse(e,phi)))


# ------------------------------
prompt = s.recv()
prompt = s.recv()

p = int(re.findall('p : (.*)',prompt)[0])
c = int(re.findall('ciphertext : (.*)',prompt)[0])
e = int(re.findall('e : (.*)',prompt)[0])
n = int(re.findall('n : (.*)',prompt)[0])

prompt = s.recv()

s.sendline('Y')

prompt = s.recv()
prompt = s.recv()


# Given p & c & e & n find plaintext

# Finding q -- Reason why I have "n = int", It took about 30 mins to figure out,
# I get given the wrong n, no idea why. 
n = 23952937352643527451379227516428377705004894508566304313177880191662177061878993798938496818120987817049538365206671401938265663712351239785237507341311858383628932183083145614696585411921662992078376103990806989257289472590902167457302888198293135333083734504191910953238278860923153746261500759411620299864395158783509535039259714359526738924736952759753503357614939203434092075676169179112452620687731670534906069845965633455748606649062394293289967059348143206600765820021392608270528856238306849191113241355842396325210132358046616312901337987464473799040762271876389031455051640937681745409057246190498795697239
q = n/p

# Compute phi(n)
phi = (q - 1) * (p - 1)

# Finding d
d = inverse(e, phi)

# c to the power of d mod n will decrypt the encryptedtext (c)
m = pow(c,d,n)

s.sendline(str(m))

# Getting our flag, yay!
print(hex(m))[2:].decode('hex')


