package InClass;

public class Encapsulation02 {
    private int age;
    private String Name;
    public void setName(String Name){
        this.Name=Name;
    }
    public void setAge(int Age){
        this.age=Age;
    }
    public void getData(String Name,int age){
        if(age>18) {
            System.out.println(Name+" is of Age : "+age+" and is Elligible to Vote !");
        }
        else{
            System.out.println(Name+" is of Age : "+age+" and is NOT Elligible to Vote !");
        }
    }
}
