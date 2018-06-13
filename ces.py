stri = input("enter the string")
key = 3
secrete_string = ""
for i in stri:
    if i.isalpha():

        secrete_string += chr(ord(i)+key)
print(secrete_string)
