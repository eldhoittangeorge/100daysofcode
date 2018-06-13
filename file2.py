import os 

with open("test.txt",encoding="utf-8") as myFile:
    while True:
        line = myFile.readline()
        if not line:
            break
        print(len(line.split()))