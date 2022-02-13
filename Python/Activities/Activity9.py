first_list = [1,2,3,4,5,6,7,8,9,10]
second_list = [1,2,3,4,5,6,7,8,9,10]
third_list = []
for x in first_list:
    if (x % 2 != 0):
        third_list.append(x)

for x in second_list:
    if (x % 2 == 0):
        third_list.append(x)

# Print result
print("result List is:")
print(third_list)