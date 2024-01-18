package Assignment271023JavaCollectios;
import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("Violet");
        l.add("Indigo");
        l.add("Blue");
        l.add("Green");
        l.add("Yellow");
        l.add("Orange");
        l.add("Red");
        System.out.println("The Elements Of This Linked List is : " + l);
        Collections.shuffle(l);
        System.out.println("The Shuffled Elements in Linked List is :"+ l);
    }
}
