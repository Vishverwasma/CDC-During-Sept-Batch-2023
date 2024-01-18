package Assignment01;
import java.util.*;
public class PrimeNotPrime {
    public static void main(String[] args) {
        int n,i,c=1;
        System.out.println("The Number To be Chacked is : ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=2;i<n;i++){
            if(n%i==0){
                c=0;
                break;
            }
        }
        if(c==1){
            System.out.println(n+" is a Prime Number !");
        }
        else if(c==0){
            System.out.println(n+" is Not a Prime Number !");
        }
    }
}
