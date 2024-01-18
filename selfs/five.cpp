#include<iostream>
using namespace std;
int main(){
string name,oname;
cout<<"Enter name : ";
cin>>name;
oname=name;
cout<<"\n Entered Name : "<<name;
cout<<"\n : "<<name.capacity();
name.resize(5);
cout<<"\n Resize Name : "<<name;
name=oname;
cout<<"\n Name with Surname : "<<name+" Verma"<<"\n";
return 0;
}