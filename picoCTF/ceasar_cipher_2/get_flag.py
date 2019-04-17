#!/usr/bin/env python

with open('ciphertext') as handle:
	# content = ^WQ]1B4iQ/SaO@M1W>V3`AMXcABMO@3\BMa3QC`3k
    content = handle.read()

    for i in range(255): # looping 255 times
        new_string = []
        for c in content: # looping through each char in content

        # chr(i) return a string of one 
        # character whose ASCII code is the integer i.

        # ord(c) in Python Given a string of length one, 
        # return an integer representing the Unicode code point of 
        # the character when the argument is a unicode object, or the 
        # value of the byte when the argument is an 8-bit string

            new_string.append(chr((ord(c) + i) % 255))

        new_string = "".join(new_string)
        if ('pico' in new_string):
            print(new_string)