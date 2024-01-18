#include<iostream>
using namespace std;
int main(){
    int a,c;
    cout<<"Enter Your Number 1 : ";
    cin>>a;
    cout<<"Enter Your Number 1 : ";
    cin>>c;
    if(c>a){
        cout<<endl<<c<<" is greater than "<<a;
    }
    else if(a>c){
        cout<<endl<<a<<" is greater than "<<c;
    }
    else if(a==c){
        cout<<endl<<a<<" is equals to "<<c;
    }
    return 0;
}