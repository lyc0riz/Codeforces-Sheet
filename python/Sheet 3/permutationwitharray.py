a=input()
x=list([int(a) for a in input().split()])
y=list([int(b) for b in input().split()])

if list(sorted(x))==list(sorted(y)):
    print("yes")
else:
    print("no")