package Assignment271023JavaCollectios;

import java.util.LinkedList;
import java.util.List;

public class Q08 {
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
        l.add("SpecifiedElement");
        System.out.println("_______________");
        System.out.println(l);
    }
}
