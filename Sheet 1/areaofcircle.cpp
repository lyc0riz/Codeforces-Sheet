#include <iostream>
using namespace std;
#define PI 3.141592653
#include<iomanip>

int main()
{
    double R,A;

    cin>>R;
    if (R>=1 && R<=100)
    {
        A=PI*R*R;
        cout << fixed << setprecision(9);
        cout<<A;
    }
}