string=input()
rang=int(input())
reps=list([int(x) for x in input().split()])

for i in range(len(reps)):
    print(string*reps[i])