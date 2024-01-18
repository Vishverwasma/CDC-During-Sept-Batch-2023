package Assignment271023HashSet;
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        TreeSet<String> l=new TreeSet<String>();
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
        TreeSet<String> c=new TreeSet<String>();
        c.add("Purple");
        c.add("Pink");
        c.add("Blue");
        c.add("Red");
        c.add("Brown");
        c.add("Black");
        c.add("Yellow");
        c.add("White");
        System.out.println("Elements in This TreeSet : ");
        System.out.println(c);
        System.out.println("________");
        List<String> t=new ArrayList<String>();
        System.out.println("Now Lets Make a New List To Show WHat element s are Present as Common in Both Tree List : ");
        for(String f:c){
            t.add(l.contains(f)?"Yes":"No");
        }
        System.out.println(t);
    }
}
