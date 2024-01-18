#include<iostream>
using namespace std;

class Matrix{
     int row,col;
     int **mat;
     public:
     Matrix(){
        int i,j;
        row=2;
        col=2;
        mat=new int*[row];
        for(i=0;i<2;i++){
            mat[i]=new int[col];
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                mat[i][j]=0;
            }
        }
     }
     Matrix(int r,int c){
        int i,j;
        row=r;
        col = c;
        mat=new int*[row];
        for(i=0;i<row;i++){
            mat[i]=new int[col];
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                mat[i][j]=0;
            }
        }
     }
     void inputdata(){
         int i,j;
         for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                cout<<"\nEnter Number : ";
                cin>>mat[i][j];
            }
         }
     }
     void display(){
        cout<<"\n : Matrix : \n";
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                cout<<mat[i][j];
            }
            cout<<endl;
        }
     }
     Matrix(Matrix const &m){
        row=m.row;
        col=m.col;
        int i,j;
        for(i=0;i<row;i++){
            mat[i]=new int[col];
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                mat[i][j]=m.mat[i][j];
            }
        }
     }
     const Matrix &operator = (const Matrix &m){
        int i,j;
        for(i=0;i<row;i++){
           delete []mat[i];
        }
        delete mat;
        row=m.row;col=m.col;
        mat=new int*[row];
        for(i-0;i<row;i++){
            mat[i]=new int[col];
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                mat[i][j]=m.mat[i][j];
            }
        }
        return *this;
     }
};

int main(){
     Matrix obj,obj2;
     obj.inputdata();
     obj.display();

     Matrix obj1(obj);

     obj1.display();
     
     obj2=obj1;
     obj2.display();
     return 0;
}