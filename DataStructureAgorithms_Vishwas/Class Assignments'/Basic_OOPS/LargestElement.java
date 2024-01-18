package Basic_OOPS;

import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        int a;

        System.out.print("Size of Array : ");
        Scanner n=new Scanner(System.in);
        a=n.nextInt();
        int b[]=new int[a];
        int i,j;
        for(i=0;i<a;i++){
            System.out.print("Element "+ (i+1) +" is : ");
            b[i]=n.nextInt();
        }
        int max=b[0];
        for(i=0;i<a-1;i++){
            if(max<b[i]){
                max=b[i];
            }
        }
        System.out.println("Largest Element is : "+max);
    }
}
