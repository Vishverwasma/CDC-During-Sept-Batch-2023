#include<iostream>
using namespace std;
int main(){
int num,n,i,j,c=0;
cout<<"EnterYour Number : ";
cin>>num;
n=num;
cout<<"\n While Loop : \n";
while(num!=0){
c=c+1;
j=num%10;
num=num/10;
cout<<j<<"\n";
}
cout<<"\n For Loop : \n";
for(i=0;i<sizeof(n);i++){
j=n%10;
c=c+1;
n=n/10;
cout<<j<<"\n";
}
}