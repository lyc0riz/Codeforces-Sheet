X=input()

if(X.isdigit()):
    print("IS DIGIT")
else:
    if(X.isalpha()):
        print("ALPHA")
        if(X.islower()):
            print("IS SMALL")
        if(X.isupper()):
            print("IS CAPITAL")

