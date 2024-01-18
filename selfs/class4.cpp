#include<iostream>
using namespace std;
class destr{
     int real,imag;
     public:
     ~destr(){
        cout<<"\n Here Destructor was called !";
     }
     destr(){
        cout<<"\n Default Constructor !";
        real=0;
        imag=0;
     }
     destr(int r){
        cout<<"\nSigle Parameter Constructor !";
        real=r;
        imag=r;
     }
     destr(int r,int i){
        cout<<"\nTwo Paramter Constructor !";
        real=r;
        imag=i;
     }
     void display(){
        cout<<"\n"<<real<<"+"<<imag<<"i\n";
     }
     destr operator +(destr c){
        destr res;
        res.real=real+c.real;
        res.imag=imag+c.imag;
        return res;
     }
};
int main(){
    int a,b,c;
    cout<<"Enter Three Random Values : \n";
    cin>>a>>b>>c;
    destr c1(a),c2(b,c),c3;
    c1.display();
    c2.display();
    c3=c1+c2;
    c3.display();
    return 0;
}