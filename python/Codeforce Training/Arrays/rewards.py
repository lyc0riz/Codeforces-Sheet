import math
trophies = list(map(int,input().split()))
medals = list(map(int,input().split()))
n=int(input())

shelves=math.ceil((sum(medals)/10))+math.ceil((sum(trophies)/5))

if shelves>n:
    print("NO")
else:
    print("YES")