package Assignment01;
import java.util.*;
public class Pattern03 {
    public static void main(String[] args) {
        int i, j, n=1,num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        for(i=0;i<=(num/3)-1;i++){
            for(j=1;j<=i;j++){
                System.out.print(n+" ");
                n=n+1;
            }
            System.out.println();
        }
    }
}