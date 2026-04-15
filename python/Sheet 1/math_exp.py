A,S,B,Q,C =[x for x in input().split()]

if(0<=int(A)<=100 and 0<=int(B)<=100 and -100000<=int(C)<=100000):
    if(S=="+"):
        if (int(C)==int(A)+int(B)):
            print("Yes")
        else:
            print(int(A)+int(B))
    if(S=="-"):
        if (int(C)==int(A)-int(B)):
            print("Yes")
        else:
            print(int(A)-int(B))
    if(S=="*"):
        if (int(C)==int(A)*int(B)):
            print("Yes")
        else:
            print(int(A)*int(B))