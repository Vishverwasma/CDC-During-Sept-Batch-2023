package Assignment271023JavaCollectios;
import java.util.*;

public class Q05 {
    public static void main(String[] args) {
        List<String> l=new LinkedList<String>();
        l.add("Violet");
        l.add("Indigo");
        l.add("Blue");
        l.add("Green");
        l.add("Yellow");
        l.add("Orange");
        l.add("Red");
        System.out.println("The Elements Of This Linked List is : "+l);

        l.set(2,"Blue");
        System.out.println("The Elements Of This Linked List after Adding an Element is : "+l);
    }
}
