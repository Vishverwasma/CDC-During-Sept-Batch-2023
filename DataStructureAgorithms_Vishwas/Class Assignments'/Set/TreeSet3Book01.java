package Set;
import java.util.*;
public class TreeSet3Book01 {
    public static void main(String[] args) {
        TreeSet<Book01> ts=new TreeSet<Book01>();
        Book01 b1 =new Book01(101,"Java","Herbert Shildt",450.0);
        Book01 b2 =new Book01(125,"C++","BalgaruSwamy",400.0);
        Book01 b3 =new Book01(102,"Data Structures","Shanmug",375.0);
        ts.add(b1);
        ts.add(b2);
        ts.add(b3);
        for(Book01 b:ts){
            System.out.println(b.id+" "+b.Name+" "+b.Author+" "+b.Price);
        }
    }
}
