#!/usr/bin/env python3

test = 'Th4C00lTheacha'
char_set = '0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!#$%&'
for i in char_set:
	with open('python_wordlist','a') as f:
		f.write(test+i+'\n')
