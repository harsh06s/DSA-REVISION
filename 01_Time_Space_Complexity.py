# Q1==================================================================================

def get_sum(numbers):
    
    sum= 0
    for i in numbers:
        sum= sum+i
    return sum
    
my_list =[19,11,200,800]
print(get_sum(my_list))

#Q2 ===================================================================================
def first_last_element(num):
    if not num:
        print("list is empty")
        
    first = num[0]
    last = num[-1]
    
    print(first ,"and",last)
    return num
    
hero_list = ["Zero", "Hard Work", "Consistency", "Hero"]
print(first_last_element(hero_list)) 

#Q3==========================================================================================
def square_astrisk(num):
    for i in range(num):
        for j in range (num):
            print("*",end=" ")
        print()
num= int(input("enter = "))

print(square_astrisk(num))    
    
    

  