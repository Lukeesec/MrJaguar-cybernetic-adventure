#!/usr/bin/bash

curl -s -X POST http://2018shell.picoctf.com:21579/button2.php | grep -oE picoCTF{.*}

