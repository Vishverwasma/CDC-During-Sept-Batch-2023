package Set;
import java.util.*;
public class Book01 implements Comparable<Book01>{
    int id;
    String Name,Author;
    double Price;
    public Book01(int id,String Name,String Author,double Price){
        this.id=id;
        this.Name=Name;
        this.Author=Author;
        this.Price=Price;
    }
    public int compareTo(Book01 b){
        if(id>b.id){
            return 1;
        }
        else if(id<b.id){
            return -1;
        }
        else{
            return 0;
        }
    }
}
