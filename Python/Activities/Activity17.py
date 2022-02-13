import pandas
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["Password", "Charl13", "AllMight"]
}
dataframe = pandas.DataFrame(data)

# Write the data to a csv file
dataframe.to_csv("Activity17.csv")