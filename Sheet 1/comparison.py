A,S,B =[x for x in input().split()]

if(-100<=int(A)<=100 and -100<=int(B)<=100):
    if(S==">"):
        if (int(A)>int(B)):
            print("Right")
        else:
            print("Wrong")
    if(S=="="):
        if (int(A)==int(B)):
            print("Right")
        else:
            print("Wrong")
    if(S=="<"):
        if (int(A)<int(B)):
            print("Right")
        else:
            print("Wrong")