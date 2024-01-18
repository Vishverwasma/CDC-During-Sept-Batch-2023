/*
Given the length and breadth of a rectangle, write a program to find whether the area of the rectangle is greater than its perimeter. For example, the area of the rectangle with length = 5 and breadth = 4 is greater than its perimeter.
*/
#include<stdio.h>
int main(){
    int l,b;
    printf("Length and Breadth Of Rectangle is : ");
    scanf("%d%d",&l,&b);
    int a=l*b,p=2*(l+b);
    if(a>p){
        printf("Area is Greater !");
    }
    else if(a<p){
        printf("Perimeter is Greater !");
    }
    
    else if(a==p){
        printf("Perimeter and area are Equal !");
    }
}