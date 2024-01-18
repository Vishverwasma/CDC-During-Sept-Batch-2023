package Assignment271023;
import java.util.*;
public class Question16 {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>();
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

        ArrayList<String> c1 = (ArrayList<String>)c.clone();
        System.out.println("After Cloning of Arraylist c to c1 we get c : ");
        System.out.println(c1);
    }
}