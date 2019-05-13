#!/usr/bin/env python

from pwn import *
import os

# Just removing un wanted output
context.log_level = ('critical')

# Running the file with elf
e = ELF('./be-quick-or-be-dead-2')

# The 1015th number in the Fibonacci Sequence
number = 59288416551943338727574080408572281287377451615227988184724603969919549034666922046325034891393072356252090591628758887874047734579886068667306295291967872198822088710569576575629665781687543564318377549435421485

# Voiding the alarm method with ret
e.asm(e.symbols['alarm'],'ret')

# Making it so calc_key changes eax to the number var & returns
e.asm(e.symbols['calculate_key'], 'mov eax,%s\nret\n' % (hex(number & 0xFFFFFFFF)))

# Saves what we've edited
e.save('./new')

# Makes the file runnable
os.system('chmod +x ./new')

# Runs the new file we've made
p = process('./new')

# Grabs the last line which is the flag
print(p.recvall()).split('\n')[-2]