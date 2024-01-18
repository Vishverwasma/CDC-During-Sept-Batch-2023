package Assignment271023;

import java.util.ArrayList;

public class Question21 {
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

        c.set(1,"White");
        System.out.println("After Replacing and Element with other Element : ");
        System.out.println(c);
        System.out.println("________");

    }
}
