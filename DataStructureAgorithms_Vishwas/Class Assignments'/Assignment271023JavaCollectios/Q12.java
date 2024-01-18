package Assignment271023JavaCollectios;
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<String> l = new LinkedList<String>();
        l.add("Violet");
        l.add("Indigo");
        l.add("Blue");
        l.add("Green");
        l.add("Yellow");
        l.add("Orange");
        l.add("Red");
        System.out.println("The Elements Of This Linked List is : " + l);
        System.out.println("Type What you wanna Remove : ");
        String x = in.next();
        l.remove(x);
                System.out.println("After Removal of " + x + " our LinkedList Comes Out to be : ");
                System.out.println(l);
        }
    }

