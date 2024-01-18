package Basic_OOPS;
import java.util.*;
public class Solution09 {
    float r;
    int l,b;
    public Solution09() {
       r=0;
       l=0;
       b=0;
    }

    public void Circle(){
        System.out.println(3.14*r*r);
    }
    public void Cube(){
        System.out.println(6*l*l);
    }
    public void Rectangle(){
        System.out.println(l*b);
    }
    public static void main(String[] args) {
       Solution09 s1 = new Solution09();
       Scanner a=new Scanner(System.in);
       System.out.println("Radius Of Circle : ");
       s1.r=a.nextFloat();
        System.out.println("Length Of Cube and Rectangle : ");
       s1.l=a.nextInt();
        System.out.println("Breadth Of Rectangle : ");
       s1.b=a.nextInt();
        s1.Circle();
        s1.Cube();
        s1.Rectangle();
    }
}
