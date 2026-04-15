x=int(input())
y=list([int(a) for a in input().split()])
min=min(y)
count=0

for i in range(len(y)):
    if y[i]==min:
        count+=1
if count%2==0:
    print("Unlucky")
else:
    print("Lucky")