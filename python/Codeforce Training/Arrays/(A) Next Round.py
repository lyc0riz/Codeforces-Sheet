x,y = map(int,input().split())
lst = list(map(int,input().split()))
count=0
for i in range(y):
    if lst[i]>=y and lst[i]>0:
        count+=lst[i]
print(count)
