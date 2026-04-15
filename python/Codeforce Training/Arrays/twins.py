n=int(input())
lst= list(map(int,input().split()))
subsets = [[]]
for num in lst:
    new_subsets = [curr + [num] for curr in subsets]
    if len(new_subsets)!=0:
        subsets += new_subsets
print(len(max(subsets)))

