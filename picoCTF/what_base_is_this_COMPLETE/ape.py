#!/usr/bin/env python3

import pwn
import re
import codecs

host, port = '2018shell2.picoctf.com', 31711

s = pwn.remote(host,port)

prompt = s.recv()

# I decoded the prompt output so I can use the re library to search for what I want
prompt = prompt.decode('utf-8')

binary = re.findall('the (.*) as a word',prompt)[0]

# Converts the var binary to int then to hex, then removes all the spaces, and finally removes the first two indexs (0x)
answer = hex(int(binary.replace(' ',''),2))[2:]
# Decodes the hex code to text: the .decode('ascii') converts it to a string from a byte
answer = codecs.decode(answer,'hex').decode('ascii')

s.sendline(answer)

# Next question, about the same thing done above.

prompt = s.recv()
prompt = prompt.decode('utf-8')

hexadecimal = re.findall('the (.*) as a word',prompt)[0]
answer = codecs.decode(hexadecimal,'hex').decode('ascii')

s.sendline(answer)

# Next question

prompt =  s.recv()
prompt = prompt.decode('utf-8')

octal = re.findall('the (.*) as a word',prompt)[0]

# Converts from octal to text, and joins the letters togethor
answer = ''.join([ chr(int(x,8)) for x in octal.split() ])

s.sendline(answer)

# Flag

prompt = s.recv()
prompt = prompt.decode('utf-8')

flag =  re.findall('Flag: (.*)',prompt)[0]
print(flag)

s.close()













