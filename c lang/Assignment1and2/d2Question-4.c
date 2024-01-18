/*
Write a program to print all prime numbers from 1 to 300. (Hint: Use nested loops, break and continue)
*/
#include<stdio.h>
int main(){
    int n=300,m[100],c=0;
    printf("1\n2\n");
    
    for(int i=1;i<n+1;i++){
        c=0;
      for(int j=2;j<=i/2;j++){
           if(i%j==0){
            c=1;
            break;
           }
    }
    if(c==0 && i!=1){
        printf("%d\n",i);
    }
    }
    
}