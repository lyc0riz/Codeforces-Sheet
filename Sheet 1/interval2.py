A,B,C,D = [int(x) for x in input().split()]

if (1<=A<=1000000000 and 1<=B<=1000000000 and 1<=C<=1000000000 and 1<=D<=1000000000 and A<=B and C<=D):
    if (A<=C and D<=B):
        print(C,D)
    elif (C<=A and B<=D):
        print(A,B)
    elif(C<A and A<=D and D<B):
        print(A,D)
    elif(A<C and C<=B and B<D):
        print(C,B)
    else:
        print("-1")