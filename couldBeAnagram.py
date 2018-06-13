a = "n?ce"
b = "nice"

for i in a:
    b = b.replace(i,'',1)
print(len(b) == a.count('?'))


# def createDic(a):
#     ad = dict()
#     for i in a:
#         if(i in ad):
#             ad[i] = ad[i] + 1
#         else:
#             ad[i] = 1
#     return ad

# aDic = createDic(a)
# bDic = createDic(b)


# def checking(a,b):
#     count = 0
#     for i in a:
#         if(i != "?"):  
#             if(i not in b):
#                 return False
#             if(i in b):
#                 if(a[i] != b[i]):
#                     return False
            
#         # if(3 == a[i]+a['?']):
#         #     return True
#         # else:
#         #     return False
        
#     return True


# def finalCheck():
#     print(len(a))
#     print(len(b))
#     check = checking(aDic,bDic)
    
#     if(not check):
#         print(aDic['?'])
#         if('?' in aDic):
#             print(len(a))
#             print(len(b))
#             if(len(a)==len(b)):
#                 return True
#             else:
#                 return False
#         else:
#             return False
#     else:
#         return True

# print(finalCheck())
