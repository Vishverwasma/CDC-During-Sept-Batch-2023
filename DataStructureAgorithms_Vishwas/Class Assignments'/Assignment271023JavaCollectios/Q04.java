package Assignment271023JavaCollectios;
import java.util.*;
public class Q04 {
    public static void main(String[] args) {
        List<String> l=new LinkedList<String>();
        l.add("Violet");
        l.add("Indigo");
        l.add("Blue");
        l.add("Green");
        l.add("Yellow");
        l.add("Orange");
        l.add("Red");
        System.out.println("The Elements os This Linked List is : "+l);
        Iterator i= ((LinkedList<String>) l).descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
