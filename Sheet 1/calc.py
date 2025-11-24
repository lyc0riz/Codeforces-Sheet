X = input() 

if("+" in X):
    A,B= [int(x) for x in X.split("+")]
    C=A+B
    print(C)
if("-" in X):
    A,B= [int(x) for x in X.split("-")]
    C=A-B
    print(C)
if("*" in X):
    A,B= [int(x) for x in X.split("*")]
    C=A*B
    print(C)
if("/" in X):
    A,B= [int(x) for x in X.split("/")]
    C=A/B
    print(int(C))