import random
list1 = list()
for i in range(0,10):
    list1.append(random.randrange(0,100))

print(list1)
i = len(list1)
while(i != 0 ):
    for j in range(0,i-1):
        if(list1[j]>list1[j+1]):
            list1[j],list1[j+1] = list1[j+1],list1[j]
    i -= 1

print(list1)
