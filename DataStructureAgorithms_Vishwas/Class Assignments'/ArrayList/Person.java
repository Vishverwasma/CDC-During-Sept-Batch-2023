package ArrayList;

import Assignment05.P;

public class Person {
    private int age;
    private long phoneNumber;
    private String name,address;
     public Person(){
        age=1;
        phoneNumber=0;
        name=null;
        address=null;
    }
    public Person(String name,int age,long phoneNumber,String address){
        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.address=address;
    }
    public void Display(){
        System.out.println(" "+name+" - "+age+" - "+phoneNumber+" - "+address);
    }
}
