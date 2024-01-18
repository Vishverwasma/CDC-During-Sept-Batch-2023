/*
The distance between two cities (in km.) is input through the keyboard. Write a program to convert and print this distance in meters, feet, inches and centimeters.
*/

#include<stdio.h>
int main(){
    int d;
    printf("Distance in KM : ");
    scanf("%d",&d);
    printf("Distance in \nmeters = %d, \nfeet = %d, \ninches = %d \nand \ncentimeters = %d",d*1000,d*3280.80,d*39370,d*100*1000);
}