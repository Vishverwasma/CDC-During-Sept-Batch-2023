package Assignment271023HashSet;
import java.util.*;
public class Q7 {
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
        List<String> m=new ArrayList<String>(l);
        System.out.println("After Conversion to Array List we Get new List as : ");
        System.out.println(m);
    }
}
