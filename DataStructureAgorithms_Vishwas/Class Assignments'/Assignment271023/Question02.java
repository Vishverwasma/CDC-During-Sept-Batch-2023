package Assignment271023;
import java.util.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
public class Question02 {
    public static void main(String[] args) {
        ArrayList<String> c=new ArrayList<String>();
        c.add("Violet");
        c.add("Indigo");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Orange");
        c.add("Red");
        System.out.println("VIBGYOR : ");
        System.out.println("________");

        Iterator i=c.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
