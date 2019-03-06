from datetime import datetime

import glob2

fileName = glob2.glob("*.txt")
with open(datetime.now().strftime("%Y-%m-%d-%H-%M-%S-%f") + ".txt", "w") as file:
    for fileName in fileName:
        with open(fileName, "r") as f:
            file.write(f.read() + "\n")
