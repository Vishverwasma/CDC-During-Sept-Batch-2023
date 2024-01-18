package Assignment271023;

import java.util.ArrayList;
import java.util.Collections;

public class Question10 {
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
        System.out.println();

        Collections.shuffle(c);
        System.out.println("________");
        System.out.println("fer Shuffling : ");
        System.out.println("________");
        System.out.println(c);
    }
}
