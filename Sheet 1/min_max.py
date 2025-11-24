A, B, C = [int(x) for x in input().split()]

if (-100000 <= A <= 100000) and \
   (-100000 <= B <= 100000) and \
   (-100000 <= C <= 100000):
    lst=[A,B,C]
    maxof=max(lst)
    minof=min(lst)
    print(minof,maxof)