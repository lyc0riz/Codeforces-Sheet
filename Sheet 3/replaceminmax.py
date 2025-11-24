x=int(input())
y=list([int(a) for a in input().split()])
min=min(y)
max=max(y)

for i in range(len(y)):
    if y[i]==min:
        minind=i
    if y[i]==max:
        maxind=i

y[minind],y[maxind]=y[maxind],y[minind]

print(*y)