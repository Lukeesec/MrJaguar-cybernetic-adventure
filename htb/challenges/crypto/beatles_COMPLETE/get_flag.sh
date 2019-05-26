#!/usr/bin/env python

import pwn
import re
import base64


# Using pwntools to automate the exe that I got from the BAND.JPG
pwn.context.log_level = 'CRITICAL'

s = pwn.process('./band.jpg.out')

prompt = s.recv()

s.sendline('')

prompt = s.recv()

s.sendline('10')

prompt = s.recv()

s.sendline('5')

prompt = s.recv()

s.sendline('2.5*16.8+1.25*10.2+40*0.65+1.5*7.5+1.25*3.2')

prompt = s.recv()
cipher = re.findall('(.*)',prompt)[2]

# Decoding base64 cipher text
decoded = base64.b64decode(cipher)

# Cutting everything out & printing
print(decoded.split(')'))[1][4:-1]