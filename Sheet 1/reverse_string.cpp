#include<iostream>
using namespace std;
class recursions
{
 public:
void func(char s[],int i,int j)
 {
    if(i>=j)
    {
        return;
    }
    swap(s[i],s[j]);
    func(s,i+1,j-1);
    //cout << s;


 }
};
int main()
{
    recursions r;
    char s[]="hello";
    int size=sizeof(s)/sizeof(s[0]);
    int i=0;
    int j = size-2;
    //cout << i << " " << j;
    r.func(s,i,j);
    cout << s;
    return 0;
}