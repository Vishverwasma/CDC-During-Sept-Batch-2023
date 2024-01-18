package Basic_OOPS;

import java.util.*;

public class Solution05 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int a,b,c=0,d;
        a=n.nextInt();
        d=a;
        while(a!=0){
            b=a%10;
            c=c*10+b;
            a=a/10;
        }
        System.out.println("REverse of Number : "+d+" is "+c );
    }
}
