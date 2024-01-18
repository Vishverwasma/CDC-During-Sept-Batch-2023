#include<iostream>
using namespace std;
int isDigit(char);
int isAlpha(char);
int isSpecialCharacter(char);
int main(){
     char no,ch,sc;
     cout<<"Enter Your Input : ";
     cin>>no;
     cout<<"\n"<<isDigit(no);
     cout<<"\nEnter Your Input : ";
     cin>>ch;
     cout<<"\n"<<isAlpha(ch);
     cout<<"\nEnter Your Input : ";
     cin>>sc;
     cout<<"\n"<<isSpecialCharacter(sc);     
}
int isDigit(char n){
        if(n>='0' && n<='9'){
            return 1;
        }
        else{
            return 0;
        }
}
int isAlpha(char n){
        if((n>='a' && n<='z') || (n>='A' && n<='Z')){
            return 1;
        }
        else{
            return 0;
        }
}
int isSpecialCharacter(char n){
        if((n>='0' && n<='9') || (n>='a' && n<='z') || (n>='A' && n<='Z')){
            return 0;
        }
        else{
            return 1;
        }
}