#include <iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter n";
    cin>>n;
    int res=1;
    for (int i = 2; i <= n; i++)
    {
        res*=i;
    }
    cout<<"Factorial of "<<n<<"is "<<res;
    
    return 0;
}