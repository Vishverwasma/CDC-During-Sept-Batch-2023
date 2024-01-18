package Assignment271023JavaCollectios;
import java.util.*;
import java.util.List;
public class Q02 {
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
        Iterator i=l.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
