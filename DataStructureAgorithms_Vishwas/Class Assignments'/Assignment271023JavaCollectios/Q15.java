package Assignment271023JavaCollectios;
import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y;
        LinkedList<String> l = new LinkedList<String>();
       l.add("Violet");
       l.add("Indigo");
       l.add("Blue");
       l.add("Green");
       l.add("Yellow");
       l.add("Orange");
       l.add("Red");
       System.out.println("The Elements Of This Linked List is : " + l);
        System.out.println("The Two Indexes From Where the Elements Are to Be Swapped Are : ");
        System.out.println("x : ");
        x=in.nextInt();
        System.out.println("y : ");
        y= in.nextInt();
        if(x<l.size() && y<l.size()) {
            Collections.swap(l, x, y);
            System.out.println("The Modified Linked LIst after Swapping is : ");
            System.out.println(l);
        }
        else{
            System.out.println("The input in Either x or y is Wrong !");
        }
    }
}
