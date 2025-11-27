x,y = [int(a) for a in input().split()]
matrix=[]
for i in range(x):
    matrix.append(list(int(a)for a in input().split()))
revmatrix=[]

for i in range(x):
    revmatrix.append(matrix[i][::-1])

for i in revmatrix:
    print(*i)
    ##