import pandas
dataframe = pandas.read_excel("Activity19.xlsx", sheet_name="Activity19")
print(dataframe)
print(dataframe.shape)
print(dataframe['Email'])
print(dataframe.sort_values('FirstName'))