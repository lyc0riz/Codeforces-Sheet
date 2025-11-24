def factorial(num):
    if num == 1:
        return 1
    if num==0:
        return 1
    else:
        return (num * factorial(num-1))
y=float(input())
lst=[]
for i in range(int(y)):
    lst.append(factorial(int(input())))
for a in range(len(lst)):
    print(lst[a])
    