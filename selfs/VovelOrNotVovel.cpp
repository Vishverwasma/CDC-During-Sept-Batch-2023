#include<iostream>
using namespace std;
int main(){
    char c;
    cout<<"Enter Your Character : ";
    cin>>c;
    cout<<endl<<"Your character is : "<<c <<" That is : ";
    switch(c){
         case 'a':
         cout<<"Vovel !";
         break;
         case 'A':
         cout<<"Vovel !";
         break;
         case 'e':
         cout<<"Vovel !";
         break;
         case 'E':
         cout<<"Vovel !";
         break;
         case 'i':
         cout<<"Vovel !";
         break;
         case 'I':
         cout<<"Vovel !";
         break;
         case 'o':
         cout<<"Vovel !";
         break;
         case 'O':
         cout<<"Vovel !";
         break;
         case 'u':
         cout<<"Vovel !";
         break;
         case 'U':
         cout<<"Vovel";
         break;
         default:
         cout<<"Not Vovel !";
    }
    return 0;
}