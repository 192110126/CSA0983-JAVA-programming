n=int(input("Enter the size of two list:"))
evenlist=[]
oddlist=[]
A=[]
s1=0
s2=0
list1=0
list2=0
print("Enter the elements in list1:")
for i in range(n):
    i=int(input(""))
    evenlist.append(i)
print("Enter the elements in list2:")
for i in range(n):
    i=int(input(""))
    oddlist.append(i)
    if(i%2==0):
        A.append(i)
    else:
                  A.append(i)
                  print("List of even numbers:",evenlist)
                  print("List of odd number:",oddlist)
