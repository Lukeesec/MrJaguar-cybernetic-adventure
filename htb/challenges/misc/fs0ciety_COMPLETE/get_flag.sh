#!/usr/bin/sh

cat sshcreds_datacenter.txt | sed -n '/^MDE/p;/^E=/q' | base64 --decode | sed 's/base.*//'

# Output is binary, just use an online decoder.
