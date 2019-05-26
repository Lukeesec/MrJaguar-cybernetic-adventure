#!/usr/bin/env python

from cryptography.fernet import Fernet

# Encrypted data
encrypted = b"gAAAAABaDDCRPXCPdGDcBKFqEFz9zvnaiLUbWHqxXqScTTYWfZJcz-WhH7rf_fYHo67zGzJAdkrwATuMptY-nJmU-eYG3HKLO9WDLmO27sex1-R85CZEFCU="

# Key to decrypt the encrypted data
f = Fernet("hBU9lesroX_veFoHz-xUcaz4_ymH-D8p28IP_4rtjq0=")

# Using the var f which is our key to decrypt the cnrypted data
decrypted = f.decrypt(encrypted)

print(decrypted)

# Cipher text
# hBU9lesroX_veFoHz-xUcaz4_ymH-D8p28IP_4rtjq0=
# gAAAAABaDDCRPXCPdGDcBKFqEFz9zvnaiLUbWHqxXqScTTYWfZJcz-WhH7rf_fYHo67zGzJAdkrwATuMptY-nJmU-eYG3HKLO9WDLmO27sex1-R85CZEFCU=
