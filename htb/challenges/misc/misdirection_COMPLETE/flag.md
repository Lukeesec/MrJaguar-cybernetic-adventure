# Problem
During an assessment of a unix system the HTB team found a suspicious directory. They looked at everything within but couldn't find any files with malicious intent. 

# Solution
Simiply look at the file DIRS (misDIRection), you will see numbers in the files in .secret, some files will have numbers and others will not have numbers; organize the numbers from lowest to greatest then write down the file name containing that number from lowest to greatest. The decode with base 64.