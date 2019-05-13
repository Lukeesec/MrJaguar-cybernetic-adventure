#!/usr/bin/bash

curl -s -u natas8:DBfUBfqQG69KvJvJ1iAbMoIpwSNQ9bWe --data "secret=oubWYf2kBq&submit=submit" http://natas8.natas.labs.overthewire.org/ | grep -oP '(?<= (natas9 is )).*'

