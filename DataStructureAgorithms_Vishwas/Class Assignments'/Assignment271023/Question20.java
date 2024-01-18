package Assignment271023;

import java.util.ArrayList;

public class Question20 {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>(7);
        c.add("Violet");
        c.add("Indigo");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Orange");
        c.add("Red");
        System.out.println(c);
        System.out.println("________");
        System.out.println("Size of c-List is : "+c.size());
        System.out.println("________");
        System.out.println("________");
        c.ensureCapacity(14);
        c.add("Purple");
        c.add("Pink");
        c.add("Blue");
        c.add("Red");
        c.add("Brown");
        c.add("Black");
        c.add("Yellow");
        c.add("White");
        System.out.println(c);
        System.out.println("________");
        System.out.println("Size of c-List is : "+c.size());
    }
}
