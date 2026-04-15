import math
A,B,C,D = [int(x) for x in input().split()]

if(1<=A<=10000000 and 1<=C<=10000000 and 1<=B<=1000000000000 and 1<=D<=1000000000000):
    if(B * math.log(A) > D * math.log(C)):
        print("YES")
    else:
        print("NO")