package Assignment271023JavaCollectios;
import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<String>();
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
        List<String> al=new ArrayList<String>(l);
        System.out.println("After Conversion the Elements in Array List Comes out to be : ");
        for(Object i:al){
            System.out.println(i);
        }
    }
}
