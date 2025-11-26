x,y=[int(x) for x in input().split()]
nums= list([int(a) for a in input().split()])
freq=[]

for i in range(1,y+1):
    freq.append(nums.count(i))
for i in range(len(freq)):
    print(freq[i])

#time limit exceeded