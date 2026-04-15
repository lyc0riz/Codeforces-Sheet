x,y = map(int, input().split())
lst = list(map(int, input().split()))
sums=[]
for i in range(y):
    start,end=(map(int, input().split()))
    sums.append(sum(lst[start-1:end]))

for i in sums:
    print(i)

## time limit exceeded