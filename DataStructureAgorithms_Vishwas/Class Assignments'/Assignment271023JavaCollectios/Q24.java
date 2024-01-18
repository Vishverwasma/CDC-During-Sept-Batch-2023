package Assignment271023JavaCollectios;
import java.util.*;
public class Q24 {
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
        LinkedList<String> l1=new LinkedList<String>();
        l1.push("Brown");
        l1.push("White");
        l1.push("Black");
        l1.push("Silver");
        l1.push("Ryan");
        l1.push("Gray");
        l1.push("Orange");
        System.out.println("The Elements in This Linked List are : "+l1);
        LinkedList<String> l2=new LinkedList<String>();
        for(String l3:l){
            l2.add(l1.contains(l3)?"Yes":"No");
        }
        System.out.println("_________________-------------------________________");
        System.out.println(l2);
    }
}