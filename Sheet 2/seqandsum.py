def sumlst(lst):
    sum=0
    for i in range(lst[0],lst[1]+1):
        sum+=i
    return sum

def enlst(lst):
    newlst=[]
    for i in range(lst[0],lst[1]+1):
        newlst.append(str(i))
    return newlst

seq=[]
z=1
while(z!=0):
    x,y=[int(a) for a in input().split()]
    if(x<=0 or y<=0):
        z=0
        break
    seq.append(sorted([x,y]))

for i in range(len(seq)):
    print(" ".join(enlst(seq[i])),"sum ={0}".format(sumlst(seq[i])))
