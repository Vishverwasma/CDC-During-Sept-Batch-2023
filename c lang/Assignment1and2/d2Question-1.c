/*
Write a program to calculate overtime pay of 10 employees. Overtime is paid at the rate of Rs. 12.00 per hour for every hour worked above 40 hours. Assume that employees do not work for fractional part of an hour.
*/
#include<stdio.h>
int main(){
    int n=10,i, h[n];
    for(i=0;i<n;i++){
    printf("Hours Worked : ");
    scanf("%d",&h[i]);
    }
    for(i=0;i<n;i++){
    printf("\nThis Employ Worked Of Worth : ");
       if(h[i]>=40){
        printf("%d\n",(h[i]-40)*12);
       }
       
       else if(h[i]<40){
        printf("0");
       }
    }
}