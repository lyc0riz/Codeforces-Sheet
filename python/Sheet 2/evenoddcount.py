y=int(input())
x=[int(a) for a in input().split()]
neg=0
pos=0
even=0
odd=0
for i in range(len(x)):
    if(x[i]>0):
        pos+=1
    if(x[i]<0):
        neg+=1
    if(x[i]%2==0):
        even+=1
    if(x[i]%2!=0):
        odd+=1

print("Even:",even)
print("Odd:",odd)
print("Positive:",pos)
print("Negative:",neg)