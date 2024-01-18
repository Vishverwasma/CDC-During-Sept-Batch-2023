package Assignest0403;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int id;
        String name,specialization;
        float Salary;

        System.out.println();
        System.out.print("Enter ID : ");
        id=sc.nextInt();
        System.out.println();
        System.out.print("User Name : ");
        name=sc.nextLine();
        System.out.println();
        System.out.print("Specialization : ");
        specialization=sc.nextLine();
        System.out.println();
        System.out.print("Salary : ");
        Salary=sc.nextFloat();

        Person p=new Person(name,id,specialization,Salary);
        p.Show();
    }
}
