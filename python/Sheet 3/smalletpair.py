testc= int(input())
N=int(input())
y=[]
sums=[]
for i in range(testc):
    y=list([int(a) for a in input().split()])
for i in range(len(y)): 
    for j in range(1,N+1):
        for k in range(2,N+1):
            sums.append(list(y[i][1]+y[i][2]+j-k))

print(sums)

## Not complete