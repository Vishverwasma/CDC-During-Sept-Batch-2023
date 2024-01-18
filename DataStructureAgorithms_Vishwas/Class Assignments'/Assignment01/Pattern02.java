package Assignment01;
import java.util.*;
public class Pattern02 {
    public static void main(String[] args) {
        int n, i, j;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=0;i<=n;i++){
            for(j=n/2+n/3;j>=i;j--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
