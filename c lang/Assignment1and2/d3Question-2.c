/*
Write a function that receives marks received by a student in 3 subjects and returns the average and percentage of these marks.
*/
#include<stdio.h>
int main(){
    int m[3],tm=0;
    printf("Please do input three Marks : \n");
    for(int i=0;i<3;i++){
         scanf("%d",&m[i]);
    }
    for(int i=0;i<3;i++){
         tm=tm+m[i];
    }
    int ta=tm/3,perc=tm/3;
    printf("Total Marks : %d\nAverage : %d\nPerccentage :%d",tm,ta,perc);
}