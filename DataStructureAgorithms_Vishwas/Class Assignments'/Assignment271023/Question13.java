package Assignment271023;
import Assignment20Oct.A;

import java.util.*;
public class Question13 {
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

        ArrayList<String> d=new ArrayList<String>();
        d.add("Purple");
        d.add("Pink");
        d.add("Blue");
        d.add("Red");
        d.add("Brown");
        d.add("Black");
        d.add("Yellow");
        d.add("White");

        ArrayList<String> e=new ArrayList<String>();
        for(String f:c){
            e.add(d.contains(f)?"Yes":"No");
        }
        System.out.println(e);
    }
}