
listName1 = [[i*j for i in range(1,10)]for j in range(1,10)]
for i in listName1:
    for j in i:
        print(j,end=",")
    print()