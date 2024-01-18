package Set;
import java.util.*;
public class TreeSet01 {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("Tree1");
        ts.add("Tree2");
        ts.add("Tree3");
        System.out.println(ts);
        Iterator it=ts.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}