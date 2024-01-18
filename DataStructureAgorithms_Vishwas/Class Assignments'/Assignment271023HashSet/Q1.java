package Assignment271023HashSet;
import java.util.*;
public class Q1 {
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
        System.out.println("What Your Wish To Append In This Hash Set : ");
        Scanner in=new Scanner(System.in);
        String x=in.next();
        l.add(x);
        System.out.println("After Appending The Element "+x+"Our Hash set Became : ");
        System.out.println(l);
    }
}
