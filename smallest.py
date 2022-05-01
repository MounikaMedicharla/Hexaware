a=[]
n=int(input("Enter no of elements:"))
for i in range(1,n+1):
    b=int(input("enter element:"))
    a.append(b)
a.sort()
print(a)
print("largest no:",a[n-1])
print("smallest no:",a[n-2])
print("Second largest no:",a[1])

