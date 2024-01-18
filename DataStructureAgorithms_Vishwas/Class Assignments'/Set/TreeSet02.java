package Set;
import java.util.*;
public class TreeSet02 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(10);
        ts.add(11);
        ts.add(15);
        ts.add(21);
        ts.add(31);
        ts.add(12);
        System.out.println("Reverse Set : "+ts.descendingSet());
        System.out.println("Value 01 : "+ts.pollFirst());
        System.out.println("Value 02 : "+ts.pollLast());
        System.out.println("HeadSet : "+ts.headSet(15,true));
        System.out.println(ts.subSet(15,false,31,true));
    }
}