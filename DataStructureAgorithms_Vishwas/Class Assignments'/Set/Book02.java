package Set;
import java.util.*;
public class Book02 implements Comparable<Book02>{
    int id;String Name;double Price;
    public Book02(int id,String Name,double Price){
        super();
        this.id=id;
        this.Name=Name;
        this.Price=Price;
    }
     public int compareTo(Book02 b){
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
