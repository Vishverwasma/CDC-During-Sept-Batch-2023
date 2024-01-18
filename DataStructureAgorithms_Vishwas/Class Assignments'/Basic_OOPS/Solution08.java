package Basic_OOPS;

import java.sql.SQLOutput;
import java.util.*;

public class Solution08 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        if(n%9==0) {
            int b[] = new int[n];
            int i = 0, j;
            while (i != n) {
                System.out.print((i + 1) + " Element : ");
                b[i] = a.nextInt();
                i = i + 1;
            }
            for(i=0;i<n;i++){
                System.out.print(" | ");
                for(j=0;j<3;j++){
                    System.out.print(b[i]+" | ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Its not Possible to make a 3x3 Matrix !");
        }
    }
}
