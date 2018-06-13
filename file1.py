import os 

with open("test.txt",mode="w",encoding="utf-8") as myFile:
    myFile.write("hello world\napple mango\njuice box")

with open("test.txt",encoding="utf-8") as myFile:
    print(myFile.readline())