#include <iostream>
#include <string>

int main() {
    long long a,b;
    
    std::cin >> a >> b;
    if(a>=1 && a<=100000 && b>=1 && b<= 100000)
    {
        std::cout << a << " + " << b << " = " << a+b <<std::endl;
        std::cout << a << " * " << b << " = " << a*b<<std::endl;
        std::cout << a << " - " << b << " = " << a-b<<std::endl;
    }   
}

// failing in test 2