/*
A five-digit number is entered through the keyboard. Write a program to obtain the reversed number and to determine whether the original and reversed numbers are equal or not.
*/
#include<stdio.h>
int main(){
    int a,b,c,s=0;
    int i;
    printf("Enter The Number : ");
    scanf("%d",&a);
    c=a;
    while(a!=0){
        b=a%10;
        s=s*10+b;
        a=a/10;
    }
    if(s==c){
        printf("\nThe Number is Palindrome ! ");
    }
    else{
        printf("\nThe Number is not Palindrome ! ");
    }
}