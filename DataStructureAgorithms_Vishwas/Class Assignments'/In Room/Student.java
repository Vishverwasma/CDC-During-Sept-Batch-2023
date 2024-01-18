package Shashwat;

import java.util.ArrayList;

public class Student extends Person{
    Student(String name, String address){ //Parameterized constructor
        this.name=name;
        this.address=address;
    }

    int average(int gSum1, int size){ //Average method
        return gSum1/size;
    }
    void show(){
        System.out.println("Student name = "+name+", Student address = "+address);
    }
}
