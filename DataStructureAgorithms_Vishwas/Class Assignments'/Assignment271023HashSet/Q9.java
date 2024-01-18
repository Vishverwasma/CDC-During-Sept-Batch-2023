package Assignment271023HashSet;
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        TreeSet<Integer> l=new TreeSet<Integer>();
        l.add(5);
        l.add(10);
        l.add(12);
        l.add(19);
        l.add(7);
        l.add(3);
        l.add(9);
        System.out.println("Elements in This HashSet : ");
        System.out.println(l);
        System.out.println("_________----------__________");
        System.out.println("Elements Less Than 7 are : ");
        for(Integer i:l){
            if(i<=7){
                System.out.println(i);
            }
        }
    }
}
