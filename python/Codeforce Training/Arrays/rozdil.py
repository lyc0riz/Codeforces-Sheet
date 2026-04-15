n=int(input())
lst=list(map(int,input().split()))
mn=min(lst)
if lst.count(mn)>1:
    print("Still Rozdil")
else:
    print(lst.index(mn)+1)    
    



