package Assignment01;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int n,m,i,a,b=0;
        System.out.println("Enter a Number To Be Checked : ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=n;
        while(n!=0){
             a=n%10;
             b=b*10+a;
             n=n/10;
        }
        if(b==m){
            System.out.println("The Number "+m+" is Palindrome ! ");
        }
        else{
            System.out.println("The Number "+m+" is Not Palindrome ! ");
        }
    }
}
