#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter Your Number : ";
    cin>>n;
    int rem = n%2;
    switch(rem){
        case 1:
        cout<<"\n\nOdd Number ! ";
        break;
        case 0:
        cout<<"\n\nEven Number ! ";
        break;
        default:
        cout<<"Your Calculations needs an evaluation !";
    }
    return 0;
}