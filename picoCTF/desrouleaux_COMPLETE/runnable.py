#!/usr/bin/env python3

import json
src_ips = []
with open('incidents.json') as incidents:
    data = json.load(incidents)
    for i in data['tickets']:
        src_ips.append(i['src_ip'])

from collections import Counter
c = Counter(src_ips)
print(c.most_common(3))
