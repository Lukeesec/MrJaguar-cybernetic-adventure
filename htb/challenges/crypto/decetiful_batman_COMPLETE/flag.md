# Solution
Baconian chiper

To change the N's to B's and to space every 5 chars
sed -i -e 's/N/B/g'  finale.txt
cat finale.txt | sed 's/.\{4\}/& /g'


T     H     E     F     L     A     G     I     S     N     A     P     I/J   E     R
BAABA AABBB AABAA AABAB ABABA AAAAA AABBA ABAAA BAAAB ABBAA AAAAA ABBBA ABAAA AABAA BAAAA
THE FLAG IS NAPIER
