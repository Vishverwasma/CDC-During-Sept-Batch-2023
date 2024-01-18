#include<iostream>
using namespace std;
int sdon(int);
int ron(int);
int fac(int);
int cube(int);
int power(int,int);
void display(){
    cout<<"\n ------------------------------------------------------------------------\n";
}
int main(){
    int n1,n2,rs;
    char ch;
    do{
        cout<<"Choose what you wish To do :\n 1. Sum of digits of number\n 2. Reverse of Number\n 3. Factorial of number\n 4. Cube of Number\n 5. Power of Number\n 6. Exit \n\n";
        cout<<"\n Enter Your Choice : ";
        cin>>ch;
        if(ch>='1' && ch<='4'){
            cout<<"\n "<<"enter Your Number :";
            cin>>n1;
        }else if(ch=='5'){
            cout<<"\nEnter Number 1 : ";
            cin>>n1;
            cout<<"\n Enter Number 2 :";
            cin>>n2;
        }
        switch(ch){
            case '1':
            rs=sdon(n1);
            cout<<"\n "<<rs<<"\n ";
            break;
            case '2':
            rs=ron(n1);
            cout<<"\n "<<rs<<"\n ";
            break;
            case '3':
            rs=fac(n1);
            cout<<"\n "<<rs<<"\n ";
            break;
            case '4':
            rs=cube(n1);
            cout<<"\n "<<rs<<"\n ";
            break;
            case '5':
            rs=power(n1,n2);
            cout<<"\n "<<rs<<"\n ";
            break;
            case '6': 
             
            break;
            default:
            cout<<"\n Invalid Entery ! If Possible Learn English and try again !";
        }
    }while(ch!='6');
    display();
    return 0;
}

int sdon(int n){
    int m,j=0;
    while(n!=0){
        m=n%10;
        j=j+m;
        n=n/10;
    }
    return j;
}
int ron(int n){
    int m,o=0;
    while(n!=0){
        m=n%10;
        o=o*10+m;
        n=m/10;
    }
    return o;
}
int fac(int n){
    int m=1,i;
    for(i=1;i<=n;i++){
        m=m*i;
    }
    return m;
}
int cube(int n){
    return n*n*n;
}
int power(int n,int m){
    int i,p=1;
    for(i=1;i<=m;i++){
        p=p*n;
    }
    return p;
}
