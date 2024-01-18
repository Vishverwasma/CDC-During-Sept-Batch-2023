#include<iostream>
using namespace std;
class date{
     private:
     int dd,mm,yy;
     public:
     void read_date(){
        cout<<"Enter Date : ";
        cin>>dd;
        cout<<"\nEnter Month : ";
        cin>>mm;
        cout<<"\nEnter Year : ";
        cin>>yy;
     }
     void display_date(){
        cout<<"\n"<<dd<<"/"<<mm<<"/"<<yy<<"\n";
     }
};
int main(){
    date obj;
    obj.read_date();
    obj.display_date();
    return 0;
}
