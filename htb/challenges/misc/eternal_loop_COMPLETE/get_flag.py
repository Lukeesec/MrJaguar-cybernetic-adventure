#!/usr/bin/python3

from zipfile import ZipFile
import os


# Gets archive's name and from that we can get the password since the 
def get_archive_name(zip_file):
 with ZipFile(zip_file, 'r') as f:
        names = f.namelist()

 return str(names[0])


# Unzips the zip
def unzip_archives(zip_file,password):
	with ZipFile(zip_file) as archive:
		archive.extractall(pwd=bytes(password,'utf8'))


# Just supply the info for the first zip file 
zip_file = 'Eternal_Loop.zip'
password = 'hackthebox'


# Keeps looping tell all the zips have been extracted; displays each zip getting extracted with the password.
while True:
	print("Extracting " + zip_file + " [pass] " + password)

	unzip_archives(zip_file,password)

	zip_file = get_archive_name(zip_file)
	password = get_archive_name(zip_file)
	if password == 'DoNotTouch':
			print("Success, switching scripts. Stopped at %s" % zip_file)
			os.system('./get_flag.sh')
			exit()
	password = password.replace('.zip', '').replace('\n','')
