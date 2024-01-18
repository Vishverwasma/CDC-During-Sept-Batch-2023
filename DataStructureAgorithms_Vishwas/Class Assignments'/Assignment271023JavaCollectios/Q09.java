package Assignment271023JavaCollectios;

import java.util.LinkedList;
import java.util.*;

public class Q09 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<String> l=new LinkedList<String>();
        l.add("Violet");
        l.add("Indigo");
        l.add("Blue");
        l.add("Green");
        l.add("Yellow");
        l.add("Orange");
        l.add("Red");
        System.out.println("The Elements Of This Linked List is : "+l);
        System.out.println("Element To Be Entered At : ");
        int n=in.nextInt();
        if(n<l.size()) {
            l.add(n, "SpecifiedElement");
            System.out.println("_______________");
            System.out.println(l);
        }else{
            System.out.println("The Index You Entered Exceeds The Size Of The Array by Moe Than 2");
        }
    }
}
