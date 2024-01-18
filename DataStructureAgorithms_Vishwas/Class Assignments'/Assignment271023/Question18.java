package Assignment271023;

import java.util.ArrayList;

public class Question18 {
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

            System.out.println("To Check If Our List Is Empty Or Not : ");
            System.out.println(c.isEmpty()?"Yes":"No");
        }
}
