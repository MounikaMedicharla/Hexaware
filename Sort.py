
a=list(map(int,input().split(",")))
for i in range(0,len(a)-1,1):
    for j in range(0,len(a)-1-i,1):
        if(a[j]>a[j+1]):
            a[j],a[j+1]=a[j+1],a[j]
print(a)

