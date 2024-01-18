#include<bits/stdc++.h>
using namespace std;
 void update(int*,int*);
// void prr(int*);
int main(){
    int a,b;
    a=10,b=12;
    int *pa,*pb;
    pa=&a,pb=&b;
    update(pa,pb);
    cout<<"\n a = "<<a<<" b = "<<b;
    return 0;
}
void update(int *p1,int *p2){
    int temp=*p1;
    *p1=*p1+*p2;
    *p2=abs(temp-*p2);
}