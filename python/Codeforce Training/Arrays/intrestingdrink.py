x= int(input())
prices = list(map(int,input().split()))
y = int(input())
drinks=[]
for i in range(y):
    drinks.append(int(input()))
count=0
days=[]
for i in drinks:
    for  j in prices:
        if i<j:
            count+=1
    days.append(count)
    count=0
print(days)