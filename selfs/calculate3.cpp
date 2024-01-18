#include<iostream>
using namespace std;
int calculate(int,int,int);
int sum(int,int);
int (*fun)(int,int);
int main(){
     int n1,n2,ch,ans;
     cout<<"\n Enter Two Numbers : \n Number1 : ";
     cin>>n1;
     cout<<"\n Number2 : ";
     cin>>n2;
    //  cout<<"Your Choice is : between 1-3 , i.e. , sum,sub and mull is : ";
    //  cin>>ch;
    //  if(ch>=4){
    //     cout<<" Invalid Choice ! Please try Again !";
    //  }
    // //  ans=calculate(n1,n2,ch);
    fun=sum;
    ans=fun(n1,n2);
     cout<<"Our asnwer for our choice : "<<ch<<" is : "<<ans;
}
int calculate(int a,int b, int c){
    int ans;
    switch(c){
    case 1:
    ans=a+b;
    break;
    case 2:
    ans=abs(a-b);
    break;
    case 3:
    ans=a*b;
    break;
    default:
    break; 
    }
    return ans;
}
int sum(int a,int b){
    return a+b;
}