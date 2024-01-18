package Assignment20Oct;
import java.util.*;
public class Solve extends MyCalculator{
    public static void main(String[] args) {
        int number;
        Scanner in=new Scanner(System.in);
        number=in.nextInt();
        MyCalculator mc=new MyCalculator();
        mc.setNum(number);
        System.out.println("This number "+number +" is divisible by following : ");
        mc.getNum();
    }
}
