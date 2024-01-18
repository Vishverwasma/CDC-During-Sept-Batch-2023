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
     integer(integer const &i){
        cout<<"\nCopy Constructor is called ! ";
        ptr=new int;
        *ptr=*i.ptr;
     }
     int getvalue(){
         return *ptr;
     }
     int setvalue( int n){
         *ptr=n;
     }
     void display(){
        cout<<"\nValue of ptr : "<<*ptr;
     }
     const integer & operator =(integer const & i){
        delete ptr;
        ptr=new int;
        *ptr=*i.ptr;
        return *this;
     }
     integer operator +(integer const & i){
         integer res;
         *res.ptr=*ptr+*i.ptr;
         return res;         
         //return integer(*ptr+*i.ptr);
     }
};
int main(){
    integer obj(15),obj1(obj);
    integer obj2;
    obj.display();
    obj1.display();
    obj1=obj;
    obj2=obj1 + obj;
    //obj2=obj1.operator+(obj);
    obj.display();
    obj1.display();
    obj2.display();
    return 0;
}
