A = float(input())

if(1<=A<=1000):

    x= A - int(A)
    if (x!=0):
        print("float",int(A),round(x,3))
    else:
        print("int",int(A))