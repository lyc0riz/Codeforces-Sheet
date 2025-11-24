A,B,C,D = [int(x) for x in input().split()]
if(2<=A<=1000000000 and 2<=B<=1000000000 and 2<=C<=1000000000 and 2<=D<=1000000000 ):
    lst1=[]
    lst2=[]
    X=A*B*C*D
    for i in range(1):
        a=X%10
        lst1.append(str(a))
    for i in range(2):
        a=X%10
        X=X//10
    lst2.append(str(a))
    Y="".join(lst2+lst1)
    print(Y)