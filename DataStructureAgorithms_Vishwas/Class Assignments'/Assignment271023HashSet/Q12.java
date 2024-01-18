package Assignment271023HashSet;
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        HashSet<String> l=new HashSet<String>();
        l.add("Violet");
        l.add("Indigo");
        l.add("Blue");
        l.add("Green");
        l.add("Yellow");
        l.add("Orange");
        l.add("Red");
        System.out.println("Elements in This TreeSet : ");
        System.out.println(l);
        System.out.println("_________----------__________");
        l.removeAll(l);
        System.out.println("To Get  The result if The this HashSet Got Empty or Not : "+(l.isEmpty()?"Yes":"No"));
    }
}
