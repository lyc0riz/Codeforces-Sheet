import math
x=int(input())

def is_prime(n):
    if n <= 1:
        return "NO"
    if n == 2:
        return "YES"
    if n % 2 == 0:
        return "NO"
    checkupto = int(math.sqrt(n))
    for i in range(3, checkupto + 1, 2):
        if n % i == 0:
            return "NO"
    return "YES"

print(is_prime(x))