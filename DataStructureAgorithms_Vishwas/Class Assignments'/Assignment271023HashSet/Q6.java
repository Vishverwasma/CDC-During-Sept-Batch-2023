package Assignment271023HashSet;
import java.util.*;
public class Q6 {
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
        //Method 1:
        HashSet<String> m=new HashSet<String>();
        for(String s:l){
            m.add(s);
        }
        System.out.println("After Cloning Elements From HashSet1 to HashSet2 we Get HashSet2 as : ");
        System.out.println(m);
        //Method 2:
        HashSet<String> n=(HashSet)l.clone();
        System.out.println("Cloning The Elements Using Method 2 we get new HashSet as : ");
        System.out.println(n);
    }
}
