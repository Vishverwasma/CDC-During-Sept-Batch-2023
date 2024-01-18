package Basic_OOPS;
import java.util.*;
public class Person {
    String name[]=new String[50];
    Date bd;
    public Person(){
        name[0]="\0";
    }
    public Person(String n[],Date d){
        name=n;
        bd=d;
    }

//
//    public Person(String n,Date d){
//
//    }

    void getter(){
      System.out.println(name+" : "+bd);
    }

    public static void main(String[] args) {
//
//        Scanner n=new Scanner(System.in);
//        String []nm=new String[50];
//        int i=0;
//        while(i!=50){
//            nm[i]=n.nextLine();
//            i++;
//        }
//        Date dob;
//        dob = n.nextDate();
//        Person p=new Person(nm,dob);


    }
}
