/*
If a five-digit number is input through the keyboard, write a program to calculate the sum of its digits. (Hint: Use the modulus operator ‘%’)
*/
#include<stdio.h>
int main(){
    int a,b,s=0;
    int i;
    printf("Enter The Number : ");
    scanf("%d",&a);
    while(a!=0){
        b=a%10;
        s=s+b;
        a=a/10;
    }
    printf("\n Sum of all Digits : %d ",s);
}   