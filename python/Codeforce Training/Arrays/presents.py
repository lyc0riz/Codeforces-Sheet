n=int(input())
lst= list(map(int,input().split()))
gift={}
fin=[]
for i in range(n):
    gift[lst[i]]=i+1
for i in range(1,n+1):
    fin.append(str(gift[i]))
print(*fin)
