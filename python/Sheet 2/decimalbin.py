def decTObinary1(a):
    lst=[]
    while(a!=0):
        temp1=a//2
        temp2=a%2
        lst.append(str(temp2))
        a=temp1
    return list(''.join(list(sorted(lst))).lstrip('0'))

def bitodec(b):
    lst=[]
    for i in range(len(b)):
        dec = 2**(len(b) - 1 - i)
        lst.append(dec)
    return sum(lst)

testc=int(input())
output=[]
for i in range(testc):
    x=int(input())
    output.append(bitodec(decTObinary1(x)))

for i in range(testc):
    print(output[i])