n=int(input())
lst=list(map(int,input().split()))
math=[]
pro=[]
spo=[]
for i in range(len(lst)):
    if lst[i]==1:
        pro.append(i+1)
    if lst[i]==2:
        math.append(i+1)
    if  lst[i]==3:
        spo.append(i+1)
x = min(len(pro), len(math), len(spo))
print(x)

for i in range(x):
    print(pro[i], math[i], spo[i])