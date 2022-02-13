def rockpaperscissors():
    FirstPerson = str(input("The first person option:"))
    SecondPerson = str(input("The second person option:"))
    if(FirstPerson == "rocks" and SecondPerson == "scissors"):
        print("First Person wins")
    elif(FirstPerson == "scissors" and SecondPerson == "rocks"):
        print("Second person wins")
    elif(FirstPerson == "scissors" and SecondPerson == "rocks"):
        print("First Person wins")
    elif(FirstPerson == "rocks" and SecondPerson == "scissors"):
        print("Second person wins")
    elif(FirstPerson == "paper" and SecondPerson == "rocks"):
        print("First person wins")
    elif(FirstPerson == "rocks" and SecondPerson == "paper"):
        print("Second person wins")
    elif(FirstPerson == SecondPerson):
        print("it's a draw")
rockpaperscissors()
for rep in range(4):
    RepeatGame = str(input("do you want to repeat the game:"))
    if(RepeatGame == "yes"):
        rockpaperscissors()
    if(RepeatGame == "no"):
        print("exit")
        break
