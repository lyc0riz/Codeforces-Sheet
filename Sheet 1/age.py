N=int(input())

years=N//365
reamining=N%365
months= reamining//30
days=reamining%30

print(f"{years} years")
print(f"{months} months")
print(f"{days} days")