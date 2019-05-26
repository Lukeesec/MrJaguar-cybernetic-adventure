#!/usr/bin/bash

 cat costumers.sql | grep -v --invert-match '3' | tail -3 | head -n1 | grep -oE 'NV.*'
