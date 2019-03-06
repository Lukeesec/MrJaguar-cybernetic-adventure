temperatures = [10, -20, -289, 100]


def temps(temp):
    with open("temps.txt", "w") as myTemps:
        for i in temp:
            if i > -273.15:
                f = i * 9 / 5 + 32
                myTemps.write(str(f) + "\n")


temps(temperatures)
