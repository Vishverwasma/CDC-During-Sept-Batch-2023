package Assignment271023;

import java.util.ArrayList;

public class Question22 {
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
        System.out.println("________");
        for(int i=0;i<c.size();i++){
            System.out.println(i+" : "+c.get(i));
        }
    }
}
