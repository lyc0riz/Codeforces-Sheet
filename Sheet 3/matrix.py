x = int(input())
matrix=[]
for i in range(x):
    matrix.extend(list(int(a)for a in input().split()))
pdia=[]
sdia=[]

pdia.extend(matrix[::x+1])
sdia.extend(matrix[x-1:-1:x-1])

print(abs(sum(pdia)-sum(sdia)))