nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3
x= list(map(int,"".join(map(str,sorted(list(nums1+nums2)))).lstrip("0")))
print(x)

