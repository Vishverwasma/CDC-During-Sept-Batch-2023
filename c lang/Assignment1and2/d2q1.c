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