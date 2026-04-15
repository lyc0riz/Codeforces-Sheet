#include <iostream>
using namespace std;

int main()
{
    long long N;

    cin>> N;

    if(N>=1 && N<=1000000000)
    {
        long long x = N * (N + 1) / 2;
        cout<<x;
    }
}