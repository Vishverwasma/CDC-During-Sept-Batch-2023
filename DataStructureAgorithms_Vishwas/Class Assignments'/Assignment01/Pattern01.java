package Assignment01;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Pattern01 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();

        for(i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();

        for(i=1;i<n-1;i++){
            System.out.print("*");
            for(j=1;j<n-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for(i=0;i<n;i++){
            System.out.print("*");
        }
    }
}
