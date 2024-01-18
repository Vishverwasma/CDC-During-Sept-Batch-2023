package Assignest03Q1;
import java.util.*;
public class Employee {
    int empid;
    float salary;
    Person details;
    public Employee(){
        empid=111;
        salary=1250000f;
        details=new Person();
    }
    public Employee(int empid,float salary,String name,int dd,int mm,int yy,float bal){
        this.empid=empid;
        this.salary=salary;
        this.details=new Person(name,dd,mm,yy,bal+salary);
    }
    void Display(){
        System.out.println("Empid : "+this.empid+" Salary : "+salary+" ");
        details.Display();
    }

    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);

        int id,dd,mm,yy;
        float sl,bal;
        System.out.print("Empid : ");
            id= ab.nextInt();
        System.out.println();
        System.out.print("Salary : ");
            sl= ab.nextFloat();
        System.out.println();
        System.out.print("Balance : ");
            bal= ab.nextFloat();
        System.out.println();
        System.out.print("Emp_Name : ");
            String nm=new String(" ");
            nm=ab.next();
        System.out.println();
        System.out.print("Date : Month : Year  ");
            dd = ab.nextInt();
            mm = ab.nextInt();
            yy = ab.nextInt();
        System.out.println();
        Employee emp=new Employee(id,sl,nm,dd,mm,yy,bal);
        emp.Display();
    }
}
