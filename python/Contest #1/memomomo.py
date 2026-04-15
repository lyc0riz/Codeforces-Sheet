x,y,z = [int(i) for i in input().split()]


if(x%z==0 and y%z==0):
    print("Both")
elif (x%z==0 and y%z!=0):
    print("Memo")
elif (x%z!=0 and y%z==0):
    print("Momo")
else:
    print("No One")