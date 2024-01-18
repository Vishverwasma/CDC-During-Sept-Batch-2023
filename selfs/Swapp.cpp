#include<iostream>
using namespace std;
void swap_val(int,int);
void swap_add(int *,int *);
void swap_ref(int &,int &);
void swap_maths(int &,int &);
int main(){
     int a,b;
     cout<<"Enter Two Numbers : \n Number 1 : ";
     cin>>a;
     cout<<"\n Number 2 : ";
     cin>>b;
      swap_val(a,b);
      cout<<"\nYour Swapped Output by swap_val is : \na :"<<a<<"\n : \nb:"<<b; 
      swap_add(&a,&b);
      cout<<"\nYour Swapped Output by swap_add is : \na :"<<a<<"\n : \nb:"<<b; 
      swap_ref(a,b);
      cout<<"\nYour Swapped Output by swap_ref is : \na :"<<a<<"\n : \nb:"<<b; 
     swap_maths(a,b);
     cout<<"\nYour Swapped Output by swap_maths is : \na :"<<a<<"\n : \nb:"<<b; 
}
void swap_val(int n1,int n2){
    int t;
    t=n1;n1=n2;n2=t;
}
void swap_add(int *r1,int *r2){
    int t;
    t=*r1,*r1=*r2,*r2=t;
}
void swap_ref(int &t1,int &t2){
    int t;
    t=t1,t1=t2,t2=t;
}
void swap_maths(int &m1,int &m2){//m1=6 m2= 5
    m1=m1+m2;//m1=11
    m2=m1-m2;//m2=11-5=6
    m1=m1-m2;//m1=11-6=5
}