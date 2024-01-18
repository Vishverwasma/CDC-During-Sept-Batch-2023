package Basic_OOPS;
import java.util.*;
public class Box {
    float r,l,b;
    public void AreaCircle(float r){
        System.out.println("Area of Circle is : "+(3.14*r*r));
    }
    public void AreaCube(float l){
        System.out.println("Area of Cube is : "+(6*l*l));
    }
    public void AreaCuboid(float l,float b){
        System.out.println("Area of Cube is : "+(l*b));
    }

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        Box circle=new Box();
        Box cuboid=new Box();
        Box cube=new Box();
        System.out.println("Radius : ");
        circle.r=a.nextFloat();
        System.out.println("Length : ");
        cube.l=a.nextFloat();
        cuboid.l=a.nextFloat();
        System.out.println("Breadth : ");
        cube.b=a.nextFloat();
        cuboid.b=a.nextFloat();
        circle.AreaCircle(circle.r);
        cuboid.AreaCuboid(cuboid.l,cuboid.b);
        cube.AreaCube(cube.l);
    }
}
