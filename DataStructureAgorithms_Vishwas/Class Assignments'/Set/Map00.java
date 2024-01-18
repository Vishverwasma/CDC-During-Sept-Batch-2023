package Set;
import java.util.*;
public class Map00 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();


        Map<Integer,String> m=new HashMap<Integer,String>();
        m.put(1,"Arjun");
        m.put(2,"Bhim");
        m.put(3,"Nakul");
        m.put(4,"Sahdev");
        m.put(5,"Yudisthir");
        System.out.println(m);

        Map<String,Integer> m1=new HashMap<String,Integer>();
        m1.put("Ram",11);
        m1.put("Lakshman",12);
        m1.put("Bharath",13);
        m1.put("Shatrughan",14);
        m1.put("Hanuman",15);
        System.out.println(m1);
        System.out.println(m1.entrySet());

        for(Map.Entry m2:m1.entrySet()){
            System.out.println(m2.getKey()+" "+m2.getValue());
        }

        Map<String,String> m3=new HashMap<String,String>();
        m3.put("Vishwas","Verma");
        m3.put("Shashwat","Sharma");
        m3.put("Shivansh","Shukla");
        m3.put("Sourabh","Gaikwad");
        m3.put("Swapnil","Mahase");
        m3.put("Abhijeet","Dudhe");
        System.out.println(m3);
    }
}
