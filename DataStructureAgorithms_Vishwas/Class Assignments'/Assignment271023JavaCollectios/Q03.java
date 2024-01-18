package Assignment271023JavaCollectios;
import java.util.*;
public class Q03 {
    public static void main(String[] args) {
        List<String> l = new LinkedList<String>();
        l.add("Violet");
        l.add("Indigo");
        l.add("Blue");
        l.add("Green");
        l.add("Yellow");
        l.add("Orange");
        l.add("Red");
        System.out.println("The Elements os This Linked List is : " + l);

        System.out.println("Iterator From : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < l.size()) {
            Iterator i = l.listIterator(n);
            while (i.hasNext()) {
                System.out.println(i.next());
            }
        }
        else{
            System.out.println("Invalid Selection");
        }
    }
}

