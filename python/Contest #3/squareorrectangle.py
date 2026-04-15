x= int(input())
dim = []
for i in range(x):
    dim.append(list(map(int,input().split())))

for i in range(len(dim)):
    if(dim[i][0]==dim[i][1]):
        print("Square")
    else:
        print("Rectangle")