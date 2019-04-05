# Problem
To be successful on your mission, you must be able read data represented in different ways, such as hexadecimal or binary. Can you get the flag from this program to prove you are ready? Connect with nc 2018shell.picoctf.com 31711.

# Solution - Revised
Very simply, when you connect to the host, there will be a qauestion, "give me the value of and convert it to a word".
The three bases are binary,hex, and octal; I just used online converters to do all the work, you could use python but it will take a little more time to do so.

Revised - I want to start making more scripts, so from watching some of john hammonds video on this solution I learned how to: added get_flag.py

Decimal will be the default, with digits from 0 to 9. The first digit must not be 0.  
A number in binary will start with a lower case “b” and be followed by only 1 and 0 digits.  
A number in octal will start with a “0” (zero) and be followed by digits from 0 to 7.  
A number in hexadecimal will start with “0x” (that’s zero again) and be followed by digits from 0 to 9 and letters from A to F.  

# Flag
Flag: picoCTF{delusions_about_finding_values_68051dea}
