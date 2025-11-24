#include <iostream>
using namespace std;

int main() 
{
    long long N,M;
    int x,y;

    cin>> N >> M;
    if (N>=0 && N<=1000000000000000000 && M>=0 && M<=1000000000000000000)
    {
        x=N%10;
        y=M%10;
        cout<< x+y;
    }
}