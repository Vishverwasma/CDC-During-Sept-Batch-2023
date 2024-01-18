package Set;
import java.util.*;
public class TreeSetQueue01 {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<String>();
        pq.add("One");
        pq.add("Two");
        pq.add("Three");
        pq.add("Four");
        pq.add("Five");
        pq.add("Six");
        pq.add("Seven");
        System.out.println("Head : "+pq.element());
        System.out.println("First : "+pq.peek());
        System.out.println("Remove : "+pq.poll());
        System.out.println(pq);
        System.out.println("Head : "+pq.element());
    }
}
