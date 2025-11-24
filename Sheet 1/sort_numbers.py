A, B, C = [int(x) for x in input().split()]
if (-1000000<=A<=1000000 and -1000000<=B<=1000000 and -1000000<=C<=1000000 ):
    lst=[A,B,C]
    lstsort = sorted(lst)
    for i in lstsort:
        print(i)
    print("")
    for i in lst:
        print(i)
