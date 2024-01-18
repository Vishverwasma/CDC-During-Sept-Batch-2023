package Shashwat;

public class Teacher extends Person{
    String courses;
    Teacher(String name, String address){ //Parameterized constructor
        this.name=name;
        this.address=address;
    }

    void show(){
        System.out.println("Teacher name = "+name+", Teacher address = "+address);
    }
}
