package Assignment271023HashSet;
import java.util.*;
public class Q4 {
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
        System.out.println("On Emptying the HashSet : "+l);
        System.out.println("We get its as "+l.removeAll(l)+" : "+l);
    }
}
