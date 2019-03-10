# The problem is
Sometimes you have to configure environment variables before executing a program. Can you find the flag we've hidden in an environment variable on the shell server?

# How I solved it
I went to the shell server and typed 'printenv | grep -oE picoCTF{.*}

# Flag 
picoCTF{eNv1r0nM3nT_v4r14Bl3_fL4g_3758492}
