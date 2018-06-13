n = int(input("enter the value of n: "))
i = 1
david = 0
milen = 0

while(n > 0):
    n = n - 8
    i += 1

print(i)
if(i%2 == 0):
    print("david")
else:
    print("milen")
    
        
def boredFriends(n):
    n=int(n)
    x=n%9
    if x==0:
        return False
    else:
        return True
        
    

