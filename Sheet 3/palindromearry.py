x= int(input())
y= list([int(a) for a in input().split()])
revy=list(reversed(y))

if y==revy:
    print("YES")
else:
    print("NO")