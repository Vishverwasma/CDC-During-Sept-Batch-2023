package Assignment271023JavaCollectios;

import java.util.*;

public class Q25 {
    public static void main(String[] args) {
            LinkedList<String> l = new LinkedList<String>();
            l.push("Violet");
            l.push("Indigo");
            l.push("Blue");
            l.push("Green");
            l.push("Yellow");
            l.push("Orange");
            l.push("Red");
            System.out.println("Elements in This Linked List : ");
            System.out.println(l);
            System.out.println("_________----------__________");
        System.out.println("Is theis Linked List Empty or Not : "+(l.isEmpty()?"Yes":"No"));
    }
}
