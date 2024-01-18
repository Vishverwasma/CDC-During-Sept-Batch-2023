package ArrayList;
import java.util.*;
public class ArrayList02 {
    public static void main(String[] args) {
        Person p0 = new Person("Vishwas Verma", 111, 6266095034l, "52/3 , Neqar Manyvar, Karishma Road,Pune ,Maharashtra ");
        Person p1 = new Person("Shashwat Sharma", 73, 9987665433l, "52/3 , Neqar Manyvar, Karishma Road,Pune ,Maharashtra ");

        ArrayList<Person> al=new ArrayList<Person>();
        al.add(p0);
        al.add(p1);
//        p0.Display();
//        p1.Display();

        Iterator it=al.iterator();
        while(it.hasNext()){
            Person p=(Person)it.next();
            p.Display();
        }
    }
}
