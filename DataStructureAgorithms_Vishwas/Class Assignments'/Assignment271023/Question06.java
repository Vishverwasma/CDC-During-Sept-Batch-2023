package Assignment271023;

import java.util.ArrayList;
import java.util.*;
public class Question06 {
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
        System.out.println();
        c.remove(2);
        System.out.println("VIBGYOR after removal : ");
        System.out.println("________");
        System.out.println(c);
    }
}
