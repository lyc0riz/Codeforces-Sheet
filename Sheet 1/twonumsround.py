import math
A,B = [int(x) for x in input().split()]
div=A/B
print(f"floor {A} / {B} = {math.floor(div)}")
print(f"ceil {A} / {B} = {math.ceil(div)}")
print(f"round {A} / {B} = {math.floor(div+0.5)}")