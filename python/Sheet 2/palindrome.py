x= list(input())

def is_pal(n):
    if n == list(reversed(n)):
        return "YES"
    else:
        return "NO"

print("".join(list(reversed(x))).lstrip("0"))
print(is_pal(x))
