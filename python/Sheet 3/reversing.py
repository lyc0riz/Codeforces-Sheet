x=int(input())
y= list([int(a) for a in input().split()])
reversed=[]
for i in range(len(y)-1,-1,-1):
    reversed.append(str(y[i]))

print(" ".join(reversed))