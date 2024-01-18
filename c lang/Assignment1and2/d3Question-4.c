/*
Write a C program to find location os given element in array.
*/
#include<stdio.h>
int main(){
    int a[100],n;
    printf("Limit is : ");
    scanf("%d",&n);
    printf("\n Enter Your Array : ");
    for(int i=0;i<n;i++){
       scanf("%d",&a[i]);
    }
    int tf;
    printf("\n To find : ");
    scanf("%d",&tf);
    printf("\n Your Value Is : ");
    for(int i=0;i<n;i++){
        if(a[i]==tf){
            printf("%d and at position %d",a[i],i+1);
        }
    }
}