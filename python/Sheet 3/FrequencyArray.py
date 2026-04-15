x,y=map(int, input().split())
nums= list(map(int, input().split()))

for i in range(1,y+1):
    print(nums.count(i))

#time limit exceeded