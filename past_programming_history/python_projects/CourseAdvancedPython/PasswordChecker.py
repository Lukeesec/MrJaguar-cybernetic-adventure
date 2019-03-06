"""filePasses = open("passwords.txt", "a+")
varEnd = str
while varEnd != "quit":
    varEnd = passwordInput = input("Please enter in your password: ")
    filePasses.write("\n" + passwordInput)
    filePasses.seek(0)
    contains = filePasses.read()
    contains = contains.splitlines()
    if varEnd == "quit":
        contains.remove("quit")
        for i in contains:
            print(i)
filePasses.close()"""

# Best way of doing the password thing
"""def writePassword(password):
    with open("passwords.txt","a+") as filePasses:
        filePasses.write("\n"+passwordInput)
        filePasses.seek(0)

def readPasswords():
    with open("passwords.txt","a+") as filePasses:
        contains=filePasses.read()
    return contains.splitlines()

def main():
    while True:
        varEnd = input("Please enter in your password: ")
        if varEnd=="quit":
            for i in readPasswords():
                print(i)
            break
        else:
            writePassword(varEnd)"""

# String formatting
"""name = input("Enter name:")
correctPassword = "Python123"
password = input('Enter your password: ')

while correctPassword != password:
    password = input("Wrong password enter again: ")

print("Hi %s you are logged in" % name)  # String formatting fixes stuff
print("Hi %s %s (name/surname)" % (name, test))  # Multiple"""
