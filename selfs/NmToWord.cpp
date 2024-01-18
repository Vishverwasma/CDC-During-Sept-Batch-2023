#include<iostream>
using namespace std;
int main(){
    int c;
    cout<<"Enter Your Number : ";
    cin>>c;
    cout<<endl<<"Your Number Is "<<c<<" and ";
    switch(c){
        case 1:
        cout<<"pronounced as one";
        break;
        case 2:
        cout<<"pronounced as two";
        break;
        case 3:
        cout<<"pronounced as three";
        break;
        case 4:
        cout<<"pronounced as four";
        break;
        case 5:
        cout<<"pronounced as five";
        break;
        case 6:
        cout<<"pronounced as six";
        break;
        case 7:
        cout<<"pronounced as seven";
        break;
        case 8:
        cout<<"pronounced as eight";
        break;
        case 9:
        cout<<"pronounced as nine";
        break;
        default:
        cout<<"Number Is Greater Than 9 ";
    }
    return 0;
}