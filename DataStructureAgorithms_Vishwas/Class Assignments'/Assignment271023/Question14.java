package Assignment271023;
import java.util.*;

public class Question14 {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>();
        ArrayList<String> c1 = new ArrayList<String>();
        c.add("Violet");
        c.add("Indigo");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Orange");
        c.add("Red");
        System.out.println("VIBGYOR : ");
        System.out.println("________");
        System.out.println(c);
        Collections.swap(c,1,4);
        System.out.println(c);
    }
}
