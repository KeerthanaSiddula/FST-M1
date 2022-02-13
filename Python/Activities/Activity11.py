fruits = {
    "apple" : 1,
    "grapes" : 2,
    "oranges":3,
}
Fruit = str(input("The fruit to check is:"));
if Fruit in fruits:
    print("The fruit is available")
else:
    print("The fruit is not available")
