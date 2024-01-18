/*
Ramesh’s basic salary is input through the keyboard. His dearness allowance is 40% of basic salary, and house rent allowance is 20% of basic salary. Write a program to calculate his gross salary
*/
#include<stdio.h>
int main(){
    float bs;
    printf("Basic Salary : ");
    scanf("%f",&bs);
    printf("\nHis Dearness Allowance : %f and HRA : %f ,results in his total income of %f ",0.4*bs,0.2*bs,0.4*bs+0.2*bs+bs);
}   