#include<iostream>
using namespace std;
void calculate_by_ref(int ,int ,int &,int &,int &);
int main(){
    int n1,n2,sum,sub,mul;
    cout<<"\n Enter Two Numbers : \n a: ";
    cin>>n1;
    cout<<"\n b: ";
    cin>>n2;
    calculate_by_ref(n1,n2,sum,sub,mul);
    cout<<"\nSum is : "<<sum<<" \nsub is : "<<sub<<" \nmul is : "<<mul;
    return 0;
}
void calculate_by_ref(int n1,int n2,int &sum,int &sub,int &mul){
    sum=n1+n2;
    sub=abs(n1-n2);
    mul=n1*n2;
}