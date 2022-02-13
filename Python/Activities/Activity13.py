def sum(numbers):
    sum = 0
    for x in numbers:
        sum = sum+x
    return sum
numList = [1,2,3,4,5,6,7,8,9]
result = sum(numList)
print(str(result))
