#!/usr/bin/expect -f

spawn ssh JaguarZz@2018shell4.picoctf.com
expect "password:"
send "mhY8KN2WE8Hrs2h\r"
interact
