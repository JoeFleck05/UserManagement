
'''
1. Create a list of your favorite musicians.
'''
def my_musician_list():
    musicians = ["Dave Matthews","Foo Fighters","Green Day","AC/DC","Blink182","Incubus"]
    return musicians
    
'''
2. Create a list of tuples, with each tuple containing the longitude and latitude 
 of somewhere you've lived or visited.
'''
def tuple_list():
    long_lat = ("24,45","89,78","56,108")
    return long_lat

'''
3. Create a dictionary that contains different attributes about you: height, 
 favorite color, favorite author, etc.
'''
def my_attributes():
    dic_of_my_traits = dict()
    dic_of_my_traits = {"height":"6'","favorite color":"red","favorite musician":"Dave Matthews","favorite MLB team":"Detriot Tigers"}
    return dic_of_my_traits

'''
4. Write a program that lets the user ask your height, favorite color, or
 favorite author, and returns the result from the dictionary you created in the
 previous challenge. 
'''
def ask_my_attributes():
    h = []
    h = input("What is my Height,Favorite Musician, and Favorite MLB Team?")
    dic_of_my_traits = dict()
    dic_of_my_traits = {"height":"6'","favorite color":"red","favorite musician":"Dave Matthews","favorite MLB team":"Detriot Tigers"}
    if h in dic_of_my_traits or m in dic_of_my_traits or t in dic_of_my_traits:
        dic_of_my_traits = dic_of_my_traits[h]
        print(dic_of_my_traits)
    else:
        print("Not my favorite.")
            
        
'''
5. Create a dictionary mapping your favorite musicians to a list of your
favorite songs by them.
'''
def list_of_song_n_musicians():
    musician_songs = {"Dave Matthews Band":"Ants are Marching", "AC/DC":"Highway to Hell", "Foo Fighters":"No Way Back"}
    return musician_songs
'''
6. Lists, tuples, and dictionaries are just a few of the containers built
 into Python. Research Python sets (a type of container). When would you use a set?
 You would use a set when you want to return unique elements.
'''


'''Split method'''
print(""""Joe Momma was here""".split(" "))

'''JOIn Method'''
first_string = "abc"
result = "+".join(first_string)
print(result)


words = ["The", "fox", "jumped", "over", "the", "fence", "."]
one = " ".join(words)
print(one)

'''Strip Space'''
s = "    tres      "
s = s.strip()
print(s)

'''Replace method'''
equ = "All animals are equal."
equ = equ.replace("a","@")
print(equ)

'''Find an Index'''
indx = "animals".index("m")
print("The index of 'm' is ")
print(indx)

try:
    "animals".index(c)
except:
    print("NOT FOUND")

'''In keyword'''
print("Cat" in "Cat in the hat")

print("Bat" in "Cat in the hat")

print("Potter" not in "Harry")

'''Escaping Strings'''
print("She said \"Surely.\"")
print('She said \"Surely.\"')

print('She said "Surely."')

'''Newline'''
print('line1\nline2\nline3')

'''Slicing'''
'''Syntax for slicing [iterable][[start_index:end_index]]'''

fict = ["Tolstoy","Camus","Orwell","Huxley","Austin"]

print(fict[0:4])

ivan = """In place of death there was light."""

print(ivan[0:17])
print(ivan[17:33])
print(ivan[:17])
print(ivan[17:])
print(ivan[:])


'''1. Print every character in the string "Camus". '''

str = "Camus"
print(str[0])
print(str[1])
print(str[2])
print(str[3])
print(str[4])

'''2. Write a program that collects two strings from a user,
    inserts them into the string "Yesterday I wrote a [response_one].
    I sent it to [response_two]!" and prints a new string. '''
# resp_one = input("What did you write yesterday? ")
# resp_two = input("Who did you give it to? ")
#
# resp_string_statement = "Yesterday I wrote a {}. I sent it to {}!".format(resp_one, resp_two)
# print(resp_string_statement)

'''3. Use a method to make the string "aldous Huxley was born in 1894."
    grammatically correct by capitalizing the first letter in the sentence. '''
grammatically_fix_string = "aldous Huxley was born in 1894."
print(grammatically_fix_string.capitalize())

'''4. Take the string "Where now? Who now? When now?" and call a method
    that returns a list that looks like: [" Where now?", "Who now?", "When now?"]. '''
str = "Where now? Who now? When now?".split("?")
print(str)

'''5. Take the list [" The", "fox", "jumped", "over", "the", "fence", "."]
    and turn it into a grammatically correct string. There should be a
    space between each word, but no space between the word fence and the period that
    follows it. (Don't forget, you learned a method that turns a list of strings into
    a single string.)'''
list = ["The", "fox", "jumped", "over", "the", "fence", "."]
sentence = " ".join(list)
sentence_corrected = sentence[0: -2] + "."
print(sentence_corrected)

'''6. Replace every instance of "s" in "A screaming comes across the sky." with
    a dollar sign. '''
replace_string_item = "A screaming comes across the sky."
print(replace_string_item.replace("s", "$"))

'''7. Use a method to find the first index of the character "m" in the string
    "Hemingw ay". '''
find_m_index = "Hemingw ay"
print(find_m_index.index("m"))

'''8. Find dialogue in your favorite book (containing quotes) and turn it into a string. '''


'''9. Create the string "three three three" using concatenation, and then again
        using multiplication. '''
print("three "+"three "+"three")
print("three "*3)

'''10. Slice the string "It was a bright cold day in April, and the clocks were
        striking thirteen." to only include the characters before the comma. '''
slice_string = "It was a bright cold day in April, and the clocks were striking thirteen."
print(slice_string[0:33])
print(slice_string[34:])


