#include<iostream>
#include<bits/stdc++.h>
#include<string.h>
using  namespace std;
class cstring{
     char *str;
     int len;
     
     public:
     cstring(){
        len=2;
        str=new char[2];
        strcpy(str,"\0");
     }

     cstring(int n){
        len=n;
        str=new char[n];
     }

     cstring(char *p){
         len=strlen(p);
         str=new char[len];
         strcpy(str,p);
     }

     ~cstring(){
        delete []str;
        str=NULL;
     }
     cstring(cstring const &o){
         len=o.len;
         str=new char[len];
         strcpy(str,o.str);
     }
     const cstring &operator=(const cstring &o){
        delete []str;
        len=o.len;
        str=new char[len];
        strcpy(str,o.str);
        return *this;
     }
     void display(){
        cout<<"String is : "<<str;
     }
};
int main(){
    char name[30];
    cout<<"\n Enter a Name : ";
    cin>>name;

    cstring obj;
    cstring obj1(15);
    cstring obj2("INFOWAY");
    cstring obj3(obj2);

    obj1=obj3;
    obj1.display();
    return 0;
}