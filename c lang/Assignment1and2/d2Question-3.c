/*
Write a program to enter numbers till the user wants. At the end it should display the count of positive, negative and zeros entered.
*/
#include<stdio.h>
int main(){
    int n,m[100];
    printf("Number of inputs you want to enter : ");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("\n");
        scanf("%d",&m[i]);
    }
    for(int i=0;i<n;i++){
        if(m[i]>0){
        printf("+ve :- %d\n",m[i]);
        }
        else if(m[i]<0){
        printf("-ve :- %d\n",m[i]);
        }
        else if(m[i]==0){
        printf("0 :- %d\n",m[i]);
        }
        }
    
}