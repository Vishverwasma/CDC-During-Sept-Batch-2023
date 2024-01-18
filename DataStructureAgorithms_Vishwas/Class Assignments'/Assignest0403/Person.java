package Assignest0403;

public class Person {
    public String Name;
    public Programmer p;
    public Person(){
        Name="\0";
        p=new Programmer();
    }
    public Person(String Name,int id,String Specialization,float salary){
        this.Name=Name;
        this.p=new Programmer(id,Specialization,salary);
    }
    public void Show(){
        System.out.println("User Name : "+Name);
        p.ShowInfo();
    }
}
