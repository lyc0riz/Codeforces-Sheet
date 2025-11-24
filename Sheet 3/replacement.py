x=int(input())
y=list([int(a) for a in input().split()])

for i in range(len(y)):
    if y[i]>0:
        y[i]="1"
    elif y[i]<0:
        y[i]="2"
    elif y[i]==0:
        y[i]="0"

print(" ".join(y))