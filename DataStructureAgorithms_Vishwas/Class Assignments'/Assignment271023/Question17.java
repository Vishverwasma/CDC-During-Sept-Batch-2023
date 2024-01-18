package Assignment271023;

import java.util.ArrayList;
import java.util.Collections;

public class Question17 {
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


        c.removeAll(c);


        System.out.println("________");
        System.out.println("________");
        System.out.println("The Empty List c : ");
        System.out.println(c);
    }
}
