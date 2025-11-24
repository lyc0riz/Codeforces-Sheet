x=int(input())
y= list([int(a) for a in input().split()])
find=min(y)
foundat=[]
for i in range(len(y)):
    if (y[i]==find):
        foundat.append(i)

print(find,foundat[0]+1)