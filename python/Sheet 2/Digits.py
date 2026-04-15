testc=int(input())
nums=[]

for i in range(testc):
    nums.append([x for x in input().split()])

for i in range(testc):
    print(" ".join(list(reversed(list(nums[i][0])))))