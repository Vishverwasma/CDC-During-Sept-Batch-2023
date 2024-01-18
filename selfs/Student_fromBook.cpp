#include<bits/stdc++.h>
using namespace std;
class student{
     int rollnumber;
     char stuname[20],subname[5][20],branch[20],grade;
     int marks[5];
     public:
     void inputdata(){
        cout<<endl<<"Enter Students Information : "<<endl;
        cout<<"\nRoll Number : ";
        cin>>rollnumber;
        cout<<"\nStudent's name : ";
        getline(cin,stuname);
        cout<<"\nBranch : ";
        getline(cin,branch);
        cout<<"\nEnter Five Subjects MArks : ";
        for(i=1;i<=5;i++){
            cout<<"\nSubjects Name :";
            getline(cin,subname[i]);
        }
        for(i=1;i<=5;i++){
            cout<<"\nMarks in :"<<i<<" subject : "<<subject[i]<<" : ";
            getline(cin,marks[i]);
             
        }
     }

     void calculate();
     void display(){

        
     }
};