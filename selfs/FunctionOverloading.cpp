#include<iostream>
using namespace std;
int sum(int,int);
float sum(float,float);
float sum(int,float);
int sum(int,int,int);
float sum(int ,float,float);
float sum(float,int);
int main(){
       cout<<"\n sum : "<<sum(10,12) ;
       cout<<"\n sum : "<<sum(10.0f,12.0f) ;
       cout<<"\n sum : "<<sum(10,12.0f) ;
       cout<<"\n sum : "<<sum(10,12,15) ;
       cout<<"\n sum : "<<sum(10,12.0f,15.0f) ;
       cout<<"\n sum : "<<sum(10.0f,12) ;
       return 0;
}
int sum(int a,int b){
    return a+b;
}
float sum(float a,float b){
    return a+b;
}
float sum(int a,float b){
    return a+b;
}
int sum(int a,int b,int c){
    return a+b+c;
}
float sum(int a,float b,float c){
    return a+b+c;
}
float sum(float a,int b){

    return a+b;
}