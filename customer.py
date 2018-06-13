nameList = list()
while True:
    check = input("Enter customer yes or no:")
    if(check.lower() == 'y'):
        fname,lname = input("enter the name of the customer:").split()
        # nameDic["fname"] = fname
        # nameDic["lname"] = lname
        nameList.append({"fname":fname,"lname":lname})
    else:
        break

for i in nameList:
    for k,v in i.items():
        print(k,v)
