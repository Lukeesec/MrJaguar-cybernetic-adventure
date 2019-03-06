"""mydict = ["name":"John", "surname":"Smith"]
print(mydict)"""


def divide(a, b):
    return a / b


print(divide(1, 0))


# When getting a error that crashes the program use try and except
def divide(a, b):
    try:
        return a / b
    except ZeroDivisionError:
        return "Zero division aint goin work"


print(divide(1, 0))
