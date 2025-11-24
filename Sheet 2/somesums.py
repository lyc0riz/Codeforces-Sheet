N,A,B = [int(x) for x in input().split()]
lastsum=[]
for i in range(1,N+1):
    if(A<=sum([int(x) for x in list(str(i))])<=B):
        lastsum.append(i)
print(sum(lastsum))
