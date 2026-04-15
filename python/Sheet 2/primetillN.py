import math
x=int(input())
def is_prime(n):
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    checkupto = int(math.sqrt(n))
    for i in range(3, checkupto + 1, 2):
        if n % i == 0:
            return False
    return True

prime=[str(i) for i in range(x+1) if is_prime(i)==True]
print(" ".join(prime))
