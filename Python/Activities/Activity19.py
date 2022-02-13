import pandas
from pandas import ExcelFile
from pandas import ExcelWriter

# Structure our data as a dictionary
data = {
    "FirstName": ["Satvik", "Avinash", "Lahri"],
    "LastName": ["Shah", "Kati", "Rath"],
    "Email": ["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"],
    "PhoneNumber": ["4537829158", "5892184058", "4528727830"]
}

dataframe = pandas.DataFrame(data)
writer = ExcelWriter("Activity19.xlsx")
dataframe.to_excel(writer, "Activity19", index=False)
writer.save()