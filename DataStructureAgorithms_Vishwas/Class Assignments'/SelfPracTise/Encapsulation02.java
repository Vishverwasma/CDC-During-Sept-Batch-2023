package SelfPracTise;
import java.util.*;

public class Encapsulation02 extends Encapsulation01{
    public static void main(String[] args) {
        int num;
        String Name;
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        Name=in.next();
        Encapsulation01 e=new Encapsulation01();
        e.Setter(num,Name);
        e.Getter();
    }
}