class Human:

    def __init__(self,name,weight):
        self.name = name
        self.weight = weight

    def nam(self):
        print("the name of the human is {}".format(self.name))

def main():
    human = Human("eldho",65)
    human.nam()

main()