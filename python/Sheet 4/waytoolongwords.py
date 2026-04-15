t = int(input())
x=[]
for i in range(t):
    x.append(list(input()))
for i in range(t):
    if len(x[i])>10:
        print(x[i][0]+str(len(x[i])-2)+x[i][-1])
    else:
        print("".join(x[i]))
