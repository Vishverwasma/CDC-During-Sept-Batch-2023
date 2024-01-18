/*
A positive integer is entered through the keyboard. Write a function to obtain the prime factors of this number. For example, prime factors of 24 are 2, 2, 2 and 3, whereas prime factors of 35 are 5 and 7.
*/
#include<stdio.h>
int main(){
    int n,i,j,c=0;
    printf("Enter the Positive Integer : ");
    scanf("%d",&n);
    for(int i=2;i<n/2;i++){
        if(n%i==0){
            for(j=2;j<=i/2;j++){
                if(i%j==0){
                    c=1;
                    break;
                }
            }
        }
        if(c==0){
            printf("%d\n",i);
        }
    }
}