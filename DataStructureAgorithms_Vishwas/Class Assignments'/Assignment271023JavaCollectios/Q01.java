package Assignment271023JavaCollectios;
import java.util.*;
public class Q01 {
    public static void main(String[] args) {
        List<String> l=new LinkedList<String>();
        l.add("Violet");
        l.add("Indigo");
        l.add("Blue");
        l.add("Green");
        l.add("Yellow");
        l.add("Orange");
        System.out.println("The Elements os This Linked List is : "+l);
        l.add("Black");
        //l.set(l.size(),"Red");
        System.out.println("After Appending an Element ot The Last Position Of This Array List : "+l);
    }
}
