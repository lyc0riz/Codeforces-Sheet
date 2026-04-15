A = int(input())

if (999<A<=9999):
    A=str(A)
    lst = [int(x) for x in list(A)]
    if (lst[0]%2==0):
        print("EVEN")
    else:
        print("ODD")
