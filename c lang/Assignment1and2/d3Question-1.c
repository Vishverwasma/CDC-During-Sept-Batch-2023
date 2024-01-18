/*
Write a function that receives 5 integers and returns the sum, average and standard deviation of these numbers.
*/
#include<stdio.h>
#include<math.h>
int main(){
    int a[5];
    for(int i=0;i<5;i++){
        scanf("%d",&a[i]);
    }
    float avg=0;
    int sum=0,sd=0;
    for(int i=0;i<5;i++){
         sum=sum+a[i];
    }
    avg=sum/5;
    for(int i=0;i<5;i++){
         sd=sd+pow(a[i]-avg,2);
    }
    
        printf("\nSum is %d, average is %f and standard Deviation is %d\n",sum,avg,sd);
    
    
}