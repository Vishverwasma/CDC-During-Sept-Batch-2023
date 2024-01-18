package Assignment271023JavaCollectios;
import java.util.*;
public class Q22 {
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
        System.out.println("Input Element For What Your are in Search OF : ");
        Scanner in=new Scanner(System.in);
        String n=in.next();
        int c=1;

        if(l.contains(n)){
            System.out.println("The element "+n+ " is Present in LinkedList ");
        }else{
            System.out.println("The element "+n+ " is not Present in LinkedList ");
        }
    }
}
