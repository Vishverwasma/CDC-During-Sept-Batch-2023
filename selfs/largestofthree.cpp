#include<iostream>
using namespace std;
int main()
{
    int i,n,c=0;
    cout<<"Enter number:";
    cin>>n;
    while(n>0)
    {
        c=c+1;
        n=n/10;
    }
    cout<<"Number of digits = "<<c;
    return 0;
}
