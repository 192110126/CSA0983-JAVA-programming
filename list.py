n=int(input("Enter Number of integers:"))
list1=[]
list2=[]
c=[]
s1=0
s2=0
maxxlist1=0
maxxlist2=0
for i in range(n):
    i=int(input(""))
    list1.append(i)
print("enter number:")
for i in range(n):
    i=int(input(""))
    list2.append(i)
    if(i%2==0):
        list1.append(i)
    else:
            list2.append(i)
s1=max(list1)
s2=max(list2)
c.append(max(list1))
c.append(max(list2))
list2.remove(s2)
list1.remove(s1)
a=list(map(,list1,list2))
print(a)
