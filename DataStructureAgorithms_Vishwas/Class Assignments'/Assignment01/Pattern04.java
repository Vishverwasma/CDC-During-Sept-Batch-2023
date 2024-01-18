package Assignment01;
import java.util.*;
public class Pattern04 {
    public static void main(String[] args) {
        int n,i,j,num=0,mun=1;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=0;i<=(n/3)-1;i++){
           for(j=1;j<=i;j++) {
             if((i+j)%2==0){
                 System.out.print(mun+" ");
             }
             else{
                 System.out.print(num+" ");
             }
           }

            System.out.println();
        }
    }
}
