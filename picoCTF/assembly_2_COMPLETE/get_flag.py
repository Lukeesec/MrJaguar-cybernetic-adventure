#!/usr/bin/env python3

ebp_plus_8 = 7
ebp_minus_4 = 40

while ebp_plus_8 < 41438:
	ebp_plus_8 += 118
	ebp_minus_4 += 1
ebp_minus_4 = hex(ebp_minus_4)
print("picoCTF{%s}" % ebp_minus_4)
