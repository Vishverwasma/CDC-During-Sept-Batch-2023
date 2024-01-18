#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Number of Rows You wish : ";
    cin>>n;
    cout<<endl<<"*"<<endl;
    for(int i=1;i<n-1;i++){
        cout<<"*";
        for(int j=1;j<i+1;j++){
            cout<<" ";
        }
        cout<<"*"<<endl;
    }
    cout<<"*";
    for(int i=1;i<n;i++){
        cout<<" *";
    }
    return 0;
}