x,y = (map(int,input().split()))
lst = sorted(list(map(int,input().split())),reverse=True)
maxsum=[num for num in lst[:y] if num > 0]
print(sum(maxsum))