def Sum(x):
    if x:
        return x + Sum(x-1)
    else:
        return 0
result = Sum(5)
print(result)