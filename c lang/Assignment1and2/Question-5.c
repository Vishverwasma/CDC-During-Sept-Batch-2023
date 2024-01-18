/*
Two numbers are input through the keyboard into two locations C and D. Write a program to interchange the contents of C and D.
*/
#include<stdio.h>
int main(){
    int a,b;
    printf("Numbers to be Swapped : ");
    scanf("%d%d",&a,&b);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("New Values Are : \na=%d and \nb=%d",a,b);
}   