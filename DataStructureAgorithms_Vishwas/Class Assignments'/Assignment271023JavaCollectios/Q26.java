package Assignment271023JavaCollectios;
import java.util.*;
public class Q26 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.push("Violet");
        l.push("Indigo");
        l.push("Blue");
        l.push("Green");
        l.push("Indigo");
        l.push("Orange");
        l.push("Red");
        System.out.println("Elements in This Linked List : ");
        System.out.println(l);
        System.out.println("_________----------__________");
        Collections.replaceAll(l,"Indigo","White");
        System.out.println("The Linked List After Changing The Values In It : ");
        System.out.println(l);
    }
}
