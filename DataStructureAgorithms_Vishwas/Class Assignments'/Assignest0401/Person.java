package Assignest0401;

public class Person {
    String name;
    Address add;
    Date bdate;
    public Person(){
         name="Vishwas Verma";
         add=new Address();
         bdate=new Date();
    }
    public Person(String name,String area,String city,String state,int dd,int mm,int yy){
        this.name=name;
        this.add=new Address(area,city,state);
        bdate=new Date(dd,mm,yy);
    }
    public void DisplayDetails(){
        System.out.println("Name : "+name+" ");
        add.ShowAddress();
        bdate.ShowDate();
    }
}
