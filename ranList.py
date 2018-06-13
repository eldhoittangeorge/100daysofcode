import random

n = random.randrange(1,5)
for i in range(0,n):
    list1 = list()
    for i in range(0,5):
        list1.append(random.randrange(1,5))
    print(list1)