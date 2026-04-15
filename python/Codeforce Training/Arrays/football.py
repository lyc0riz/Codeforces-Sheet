n=int(input())
lst=[]
score={}
for i in range(n):
    lst.append(input())
for i in lst:
    if i in score:
        score[i]+=1
    else:
        score[i]=1

print(sorted(score.items(),key=lambda x:x[1],reverse=True)[0][0])

