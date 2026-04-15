x=int(input())
y=list([int(a) for a in input().split()])
res=[]
for i in range(len(y)):
    for j in range(len(y)):
        if y[i]<y[j]:
            y[i],y[j]=y[j],y[i]

for i in range(len(y)):
    res.append(str(y[i]))
print(" ".join(res))