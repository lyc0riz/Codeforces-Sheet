n = int(input())
pile = list(map(int,input().split()))
m = int(input())
find = list(map(int,input().split()))
total=[]
temp=0
for i in pile:
    temp+=i
    total.append(temp)
for i in range((len(find))):