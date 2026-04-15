x = list(input())
y = list(input())

print(len(x),len(y))
print("".join(x)+"".join(y))
x[0],y[0]=y[0],x[0]
print("".join(x),"".join(y))
