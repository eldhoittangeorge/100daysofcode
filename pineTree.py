i = int(input("enter the height of the pine tree:"))
space = i - 1
hashes = 1
while(i != 0):
    for j in range(space):
        print(" ",end="")
    for j in range(hashes):
        print("#",end="")
    print()

    space -= 1
    hashes += 2
    i -= 1
    
    
        