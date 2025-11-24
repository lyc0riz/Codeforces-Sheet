x=list(input())
if(int(x[1])!=0):
    if (int(x[1])%int(x[0])==0 or int(x[0])%int(x[1])==0):
        print("YES")
    else:
        print("NO")
else:
    print("YES")