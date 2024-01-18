package SelfPracTise;

import java.util.Scanner;

public class Encapsulation01 {
    private int number;
    private String Name;
    public void Getter(){
        System.out.println(" Name : "+Name+" || Number : "+number);
    }
    public void Setter(int number,String Name){
        this.number=number;
        this.Name=Name;
    }
}