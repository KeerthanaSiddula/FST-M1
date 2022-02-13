def fibonacci(x):
    if x <= 1:
        return x
    else:
        return(fibonacci(x-1) + fibonacci(x-2))

number = int(input("Enter a number: "))

if number <= 0:
    print("Enter a number")
else:
    print("Fibonacci Sequence: ")
    for i in range(number):
        print(fibonacci(i))