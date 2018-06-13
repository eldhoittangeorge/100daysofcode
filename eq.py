def solve(stri):
    lis = list()
    for i in stri:
        if(i.isdigit()):
            lis.append(i)
    return int(lis[1]) - int(lis[0])

print(solve("x + 4 = 9"))

