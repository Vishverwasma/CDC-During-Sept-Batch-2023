package Basic_OOPS;
import java.util.*;
public class Area
{
    int radius=0,length=0,height=0,width=0;
    public Area(){
        radius=0;
        length=0;
        height=0;
        width=0;
    }
    public Area(int l,int b,int h,int r){
        radius=r;
        length=l;
        height=h;
        width=b;
    }
    public float AreaCircle(int r){
       float area= (float)3.14*r*r;
       return area;
    }
    public float AreaTriangle(int b,int h){
        float area= (float)1/2*(b*h);
        return area;
    }
    public float AreaSquare(int l){
        float area= l*l;
        return area;
    }
    public float AreaRhombus(int l,int w){
        float area= (float)l*w;
        return area;
    }

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int l,b,h,r;
        System.out.print("Length : ");
        l=a.nextInt();
        System.out.print("Base : ");
        b=a.nextInt();
        System.out.print("Height :");
        h=a.nextInt();
        System.out.print("Radius : ");
        r=a.nextInt();
        Area A=new Area(l,b,h,r);
        System.out.println(A.AreaCircle(r));
        System.out.println(A.AreaTriangle(b,h));
        System.out.println(A.AreaSquare(l));
        System.out.println(A.AreaRhombus(l,h));
    }
}
