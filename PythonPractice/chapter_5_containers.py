
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
'''
