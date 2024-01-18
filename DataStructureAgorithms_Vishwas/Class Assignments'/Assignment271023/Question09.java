package Assignment271023;
import java.util.ArrayList;
import java.util.Collections;
public class Question09 {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>();
        ArrayList<String> c1=new ArrayList<String>();
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
        System.out.println("Copied All Elements from Collection c : ");


        c1.add("1");
        c1.add("2");
        c1.add("3");
        c1.add("4");
        c1.add("5");
        c1.add("6");
        c1.add("7");
        Collections.copy(c1,c);
        System.out.println(c1);
    }
}

