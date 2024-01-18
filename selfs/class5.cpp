#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class student{
     int rno;
     char name[20];
     char branch[30];
     int marks;
     char grd;
     public:
    ~student(){
        cout<<"\n--------------\n";
    }
    student(){
        rno=0;
        marks=0;
        grd=' ';
    }
    student(int r,int m,char g,char n[20],char b[30]){
         cout<<"\nThis Students Details Are :\n";
         rno=r;
         marks=m;
         strcpy(name,n);
         strcpy(branch,b);
         grd=g;
    }
     void getval(){        
         cout<<"\nThis Students Details Are :\n";
    }
};

int main(){
     
}