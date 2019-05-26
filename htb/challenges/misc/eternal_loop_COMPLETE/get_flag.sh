#!/usr/bin/bash

PWD=$(fcrackzip -u -D -p /usr/share/wordlists/rockyou.txt 6969.zip | grep -oP '(?<= (== )).*')
unzip -qq -P $PWD 6969.zip && cat DoNotTouch | grep -a -oP HTB{.*}
