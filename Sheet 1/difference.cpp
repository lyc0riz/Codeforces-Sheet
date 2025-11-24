#include <iostream>
using namespace std;
int main() {
    long long A,B,C,D,X ;
    cin >> A >> B >> C >> D;
    if (A >= -100000 && A <= 100000 && B>= -100000 && B <= 100000 && C>= -100000 && C<= 100000 && D>= -100000 && D <= 100000)
    {
        X = (A*B)-(C*D);
        cout << "Difference = " <<X;
    }
}