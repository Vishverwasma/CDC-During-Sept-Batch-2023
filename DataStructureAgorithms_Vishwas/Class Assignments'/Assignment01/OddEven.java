package Assignment01;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        int n,i;
        System.out.println("Enter The Number To Be Checked : ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        if(n%2==0){
            System.out.println("The Number "+n+" is Even ! ");
        }
        else{
            System.out.println("The Number "+n+" is Odd ! ");
        }
    }
}
