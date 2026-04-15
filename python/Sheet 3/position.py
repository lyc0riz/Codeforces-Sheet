x=int(input())
y=list([int(a) for a in input().split()])

index=[]
num=[]

for i in range(len(y)):
    if y[i]<=10:
        index.append(i)
        num.append(y[i])

for i in range(len(index)):
    print(f"A[{index[i]}] = {num[i]}")