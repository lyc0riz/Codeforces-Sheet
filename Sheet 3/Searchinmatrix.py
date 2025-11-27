x,y = [int(x) for x in input().split()]
rows=[]
for i in range(x):
    rows.extend(list(int(a)for a in input().split()))
search = int(input())

if search in rows:
    print("will not take number")
else:
    print("will take number")