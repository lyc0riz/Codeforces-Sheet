def sumodd(lst):
    sum=0
    for i in range(lst[0]+1,lst[1]):
        if i%2!=0:
            sum+=i
            if sum==0:
                return 0
    return sum

testc=int(input())
nums=[]

for i in range(testc):
    x,y=[int(a) for a in input().split()]
    nums.append(sorted([x,y]))

for i in range(testc):
    print(sumodd(nums[i]))