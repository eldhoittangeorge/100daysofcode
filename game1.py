import random

    
class warrior:

    testClassVariable = "test"

    @staticmethod
    def staticTestMethod(value1, value2):
        return value1 * value2

    @classmethod
    def change(cls,value):
        cls.testClassVariable = value

    def __init__(self,name,health):
        self.name = name 
        self.health = health

    @property
    def names(self):
        return self.name 
        
    @names.setter
    def names(self,value):
        self.name = value

   

    def attacked(self,value):
        self.health = (self.health + self.block()) - value
        print(self.health)

    def block(self):
        return random.randrange(0,10)



def main():
    i = 0
    sam = warrior("sam",100)
    paul = warrior("paul",100)
    
    while True:
        if(i%2 == 0):
            value = random.randrange(1,30)
            print("sam attacks paul and deal {} damage".format(value))
            paul.attacked(value)
            if(paul.health <= 0):
                print("paul died and sam is victorious")
                break
        else:
            value = random.randrange(1,30)
            print("paul attacks sam and deal {} damage".format(value))
            sam.attacked(value)
            if(sam.health <= 0):
                print("sam died and paul is victorious")
                break
            
        i += 1


sam = warrior("sam",10)       
print(sam.names)
sam.names = "paul"
print(sam.names)
