#!/usr/bin/bash

unzip -P hackthebox misDIRection.zip | grep -oE '/.*' | sort -t/ -k 3,3 -n | tail -36 | cut -d / -f2 |base64 -d 
