package Assignment271023;

import java.util.*;
import java.util.Collections;

public class Question12 {
    public static void main(String[] args) {
        List<String> c = new ArrayList<String>();
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

        List<String> sublist=c.subList(0,3);
        System.out.println("Value in range of index 0-3 : ");
        System.out.println(sublist);
    }
}
