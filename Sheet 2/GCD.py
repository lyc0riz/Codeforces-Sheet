x,y = [int(a) for a in input().split()]
forx=[]
fory=[]

for i in range(1,x+1):
    if(x%i==0):
        forx.append(i)
for j in range(1,y+1):
    if(y%j==0):
        fory.append(j)

xandy=[item for item in forx if item in fory]
print(max(xandy))
print(xandy)
        
