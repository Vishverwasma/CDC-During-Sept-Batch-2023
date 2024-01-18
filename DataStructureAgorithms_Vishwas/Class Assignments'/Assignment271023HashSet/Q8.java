package Assignment271023HashSet;
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        HashSet<String> l=new HashSet<String>();
        l.add("Violet");
        l.add("Indigo");
        l.add("Blue");
        l.add("Green");
        l.add("Yellow");
        l.add("Orange");
        l.add("Red");
        System.out.println("Elements in This HashSet : ");
        System.out.println(l);
        System.out.println("_________----------__________");
        TreeSet<String> m=new TreeSet<String>(l);
        System.out.println("After Conversion to Tree Set We receive a new set as : ");
        System.out.println(m);
    }
}
