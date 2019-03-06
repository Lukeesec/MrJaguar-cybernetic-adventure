# Shadow file | In the Linux operating system, a shadow file is a system file which contains
# an encrypted user password. This file is not available to people who try to break
# into the operating system. The file is actually located in /etc/passwd.

 
root:$6$q7xpw/2.$la4Kuaksdjfhklagljasdf.123/1.:17770:0:9999999:7:::

root | is a username
$6$| is id, an algorithm used to encrypt
          - $1$ is MD5
          - $2a$ is Blowfish
          - $2y$ is Blowfish
          - $5$ is SHA-256
          - $6$ is SHA-512
q7xpw/2. | is salt
la4Kuaksdjfhklagljasdf.123/1. | is hash

# ID = root
# Algorithm = SHA-512
# Salt = q7xpw/2.
# Hash = la4KiUz87ohdszbOVoIopy2VTwm/5jEXvWSdWynh0CnP5T.MnJfVNCzp3IfJMHUNuBhr1ewcYd8PyeKHqHQoe.
# Leaked Password List/Dictionary: Rockyou
