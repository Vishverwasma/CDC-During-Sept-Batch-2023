#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter Your number : ";
    cin>>n;
    cout<<endl;
    // <<endl<<endl;
    if(n>0){
        cout<<"Positive Integer ! ";
    }
    else if(n<0){
        cout<<"Negative Integer ! ";
    }
    else if(n==0){
        cout<<"Damn Its a Zero !";
    }
    return 0;
}