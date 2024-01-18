package Basic_OOPS;
import java.util.*;
public class Solution07 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n,i=0,c;
        n=a.nextInt();
        int b[]=new int[n];
        while(i!=n){
            System.out.print(" Element "+(i+1)+" of array : ");
            b[i]=a.nextInt();
            i=i+1;
            System.out.println();
            if(i==n-1){
                break;
            }
        }
        int x=0;
        System.out.println("Number to Find : ");
        c=a.nextInt();
        for(i=0;i<n;i++){
            if(b[i]==c){
                System.out.println("Number "+c+" is found at position = "+(i+1));
            }
            else if(b[i]!=c){
                x=x+1;
            }
        }
        if(x==n){
            System.out.println("The Number Was Not Found in The Array ! ");
        }
    }
}
