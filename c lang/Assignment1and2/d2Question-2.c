/*
Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number. For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
*/
#include<stdio.h>
#include<math.h>
int main(){
    int i , j , k=0 , l=500 ,cube ,m=0;
    for(i=1;i<=l;i++){
        m=i,k=0,j=0,cube=0;
        while(m!=0){
        j=m%10;
        cube=pow(j,3);
        k=k+cube;
        m=m/10;
        }
        if(i==k){
            printf("%d\n", i);
        }
    }
}