#Write a program that prints a message if a variable is less than or equal to 10,
#another message if the variable is greater than 10 but less than or equal to 25,
#and another message if the variable is greater than 25.



x = 27

if x < 10:
    print("x is more than 10")
elif x >= 10 and x <= 25:
    print("x fell between 10 n 25")
elif x >= 25:
    print("x more than 25")
