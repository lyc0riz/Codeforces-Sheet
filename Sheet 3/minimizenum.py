x=int(input())
y= list([int(a) for a in input().split()])
count=0
while all(x%2==0 for x in y):
    for i in range(x):
        y[i]=y[i]/2
    count+=1
print(count)