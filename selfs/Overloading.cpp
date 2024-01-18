#include<iostream>
using namespace  std;
class integer{
     int *ptr;
     public:
     integer(){
        ptr=new int;
        *ptr=0;
     }
     integer(int n){
         cout<<"\nParamterized Constructor is called ! ";
         ptr=new int;
         *ptr=n;
     }
     ~integer(){
        cout<<"\n Destructor is Called ! ";
        delete ptr;
        ptr=NULL;
     }
     void display(){
        cout<<"\nValue of ptr : "<<*ptr;
     }
     integer(integer const &i){
        cout<<"\nCopy Constructor is called ! ";
        ptr=new int;
        *ptr=*i.ptr;
     }
};
int main(){
    integer obj(15),obj1(obj),obj2();
    obj.display();obj1.display();return 0;
}
