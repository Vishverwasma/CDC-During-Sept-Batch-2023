package Assignment01;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int n,i,fac=1;
        System.out.println("Enter The Number For Factorial : ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=n;i>=1;i--){
            fac=fac*i;
        }
        System.out.println("Factoria of Number : "+n+" comes out to be : "+fac);
    }

}
