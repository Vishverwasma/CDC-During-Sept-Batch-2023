package Basic_OOPS;
import java.util.*;
public class Que03 {
    public static void main(String[] args) {
        int i=0, j;
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int a[] =new int[num];
        while(i!=num) {
            System.out.print((i+1)+" = ");
            a[i]=n.nextInt();
            i++;
            if(i==num){
                break;
            }
        }
        int max;
        for(i=0;i<num;i++) {
            for (j = i + 1; j < num; j++) {
                if (a[j] < a[i]) {
                    max = a[j];
                    a[j] = a[i];
                    a[i] = max;
                }
            }
            if (i != num - 1) {
                System.out.print(a[i] + " , ");
            }
            else if(i==num-1){
                System.out.print(a[i] + " ! ");
            }
        }
    }
}