import os

import pandas

# Listing dirs
os.listdir()

# Creating DataFrames (csv,json,xlsx,txt)
df1 = pandas.read_csv("supermarkets.csv")
df2 = pandas.read_json("supermarkets.json")
df3 = pandas.read_excel("supermarkets.xlsx", sheet_name=0)
df4 = pandas.read_csv("supermarkets-commas.txt")
df5 = pandas.read_csv("supermarkets-semi-colons.txt", sep=";")

# Splicing data frames
df2.set_index("Address")
df2.loc["735 Dolores St":"332 Hill St", "Country":"ID"]
