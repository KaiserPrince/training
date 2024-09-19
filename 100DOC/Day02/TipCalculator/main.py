print("Welcome to the tip calculator.")
total_bill = float(input("What was the total bill? "))
number_of_diners = float(input("How many people to split the bill? "))
tip_percentage = float(input("What percentage tip would you like to give? 10/12/15 %\n"))
tip_amount = (total_bill * tip_percentage)/100
share_of_each_diner = (total_bill + tip_amount)/number_of_diners

print("Each person should pay: $"+str(round(share_of_each_diner,2)))

print("You are tipping a total of $"+str(round(tip_amount,2)))
