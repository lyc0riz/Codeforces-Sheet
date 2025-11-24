x=int(input())
y= list([int(a) for a in input().split()])
find=int(input())
found=0
foundat=[]
for i in range(len(y)):
    if (y[i]==find):
        found+=1
        foundat.append(i)

if(found>0):
    print(foundat[0])
else:
    print("-1")