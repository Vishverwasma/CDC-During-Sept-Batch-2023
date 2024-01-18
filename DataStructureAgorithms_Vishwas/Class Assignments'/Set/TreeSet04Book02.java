package Set;
import Assignment20Oct.B;

import java.util.*;
public class TreeSet04Book02 {
    public static void main(String[] args) {
        Queue<Book02> q=new PriorityQueue<Book02>();
        Book02 b1=new Book02(101,"Java",400);
        Book02 b2=new Book02(121,"C++",450);
        Book02 b3=new Book02(102,"Data Structrues",375);
        q.add(b1);
        q.add(b2);
        q.add(b3);
        for(Book02 b:q){
            System.out.println(b.id+" "+b.Name+" "+b.Price);
        }
    }
}
