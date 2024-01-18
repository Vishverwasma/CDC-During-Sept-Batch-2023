package Basic_OOPS;

import java.util.*;

public class Solution06 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n,i;
        n=a.nextInt();
        for(i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
