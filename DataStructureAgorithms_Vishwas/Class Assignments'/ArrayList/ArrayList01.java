package ArrayList;
import java.util.*;
public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Apple");
        al.add("Banana");
        al.add("Carrot");
        al.add("Dragon Fruit");
        al.add("ElderBerry");
        al.add("Fig");
        al.add("Grapes");
        al.add("HoneyDew");
        al.add("Indian Apple");
        al.add("JackFruit");
        al.add("Lemon");
        al.add("Mango");
        al.add("Nectarine");
        al.add("Orange");
        al.add("Pineapple");
        al.add("Quince");
        al.add("Radish");
        al.add("StrawBerry");
        al.add("Tomato");
        al.add("UgliFruit");
        al.add("Vanilla");
        al.add("WaterMellon");
        al.add("Xigua");
        al.add("Yam");
        al.add("Zapose");
        System.out.println(al);

        ArrayList<Integer> ai=new ArrayList<Integer>();
        ai.add(0);
        ai.add(2);
        ai.add(3);
        ai.add(1);
        ai.add(4);
        ai.add(7);
        ai.add(8);
        ai.add(6);
        ai.add(10);
        ai.add(9);
        ai.add(5);
        System.out.println(ai);

        LinkedList<String> li=new LinkedList<String>();
        li.add("Vishwas Verma");
        li.add("Shashwat Sharma");
        li.add("Sourabh Gaikwad");
        li.add("Shubham Pokle");
        li.add("Swapnil Mhaske");
        li.add("Piyush Thakur");
        li.add("Lavanshu deshmukh");
        li.add("Rushikesh");

        LinkedList<Integer> il=new LinkedList<Integer>();
        il.add(1);
        il.add(4);
        il.add(2);
        il.add(5);
        il.add(7);
        il.add(3);
        il.add(8);
        il.add(6);
        //il.add(9);
        //il.add(10);

        Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        System.out.println();


        System.out.println("Q. Write a java program to find whether arrayList is empty or not "+al.isEmpty());
        System.out.println();
        System.out.println();
        System.out.println("Q. write a java program to find size og array and linked list : "+al.size());
        System.out.println();
        System.out.println();
        System.out.println("Q. Write a java program to reverse arrayList. : ");
        ListIterator<String> it1=al.listIterator(al.size());
        while(it1.hasPrevious()){
            String str=it1.previous();
            System.out.println(str);
        }

        System.out.println();
        System.out.println();
        System.out.println("Q. Write a java program to add elements in arraylist and print all elements in array list using for each loop. : ");
        ai.add(11);
        ai.add(12);
        ai.add(13);
        ai.add(14);
        ai.add(15);
        //System.out.println(ai);
        System.out.println();
        System.out.println();
        System.out.print("[ ");
        for(Integer i:ai){
            System.out.print(i+" ,");
        }
        System.out.print(" ]");
        System.out.println();
        System.out.println();

        System.out.println("Q. Write a java program to add 13,12,18,40, write a logic to remove only odd elements from the list and print only even numbers. : ");

        ai.add(13);
        ai.add(12);
        ai.add(18);
        ai.add(40);
         for(int i=0;i<ai.size();i++){
             if(i%2!=0) {
                 System.out.print(ai.get(i)+" ");
             }
         }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Q. Write a java program to add numbers in an array list and linked list sort the elements in both.");
        System.out.println();
        System.out.println("Before Sorting "+al);
        Collections.sort(al);
        System.out.println("After Sorting "+al);
        System.out.println();
        System.out.println();
        System.out.println("Before Sorting "+ai);
        Collections.sort(ai);
        System.out.println("After Sorting "+ai);
        System.out.println();
        System.out.println();
        System.out.println("Before Sorting "+li);
        Collections.sort(li);
        System.out.println("After Sorting "+li);
        System.out.println();
        System.out.println();
        System.out.println("Before Sorting "+il);
        Collections.sort(il);
        System.out.println("After Sorting "+il);
        System.out.println();
        System.out.println();
        System.out.println("Q. Create a class Person with fields name, age, address, phone number. print object person using array list and linked list.");
        System.out.println();
        System.out.println();

    }
}