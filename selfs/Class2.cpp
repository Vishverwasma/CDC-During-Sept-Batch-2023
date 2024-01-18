#include<iostream>
using namespace std;
 
class mycomplex{
     private:
     int real,imag;
     public:
     void setreal(int r){
        real=r;
     }
     void setimag(int r){
        imag=r;
     }
     void display(){
        cout<<real<<"+"<<imag<<"i\n";
     }
     mycomplex add(mycomplex c){
        mycomplex res;
        res.real=real+c.real;
        res.imag=imag+c.imag;
        return res;
     }
     mycomplex operator +(mycomplex c){
        mycomplex res;
        res.real=real+c.real;
        res.imag=imag+c.imag;
        return res;
     }
     mycomplex sub(mycomplex c){
        mycomplex res;
        res.real=real-c.real;
        res.imag=imag-c.imag;
        return res;
     }
     mycomplex operator -(mycomplex c){
        mycomplex res;
        res.real=real-c.real;
        res.imag=imag-c.imag;
        return res;
     }
};

int main(){
    int r1,r2,i1,i2;


    cout<<"Your real's : ";
    cin>>r1>>r2;
    cout<<"\nYour Imaginarie's : ";
    cin>>i1>>i2;


    mycomplex c1,c2,c3,c4,c5,c6;


    c1.setreal(r1);
    c1.setimag(i1);
    c2.setreal(r2);
    c2.setimag(i2);


    c3=c1.add(c2);
    c4=c1+c2;
    c5=c1.sub(c2);
    c6=c1-c2;

    cout<<"\nOur Value For C1 is : ";
    c1.display();
    cout<<"\nOur Value For C2 is : ";
    c2.display();
    cout<<"\n Using add in terms : ";
    c3.display();
    cout<<"\n Using add in Operator Overloading : ";
    c4.display();
    cout<<"\n Using Sub in Terms : ";
    c5.display();
    cout<<"\n Using Sub in Operator Overloading : ";
    c6.display();
    return 0;
}