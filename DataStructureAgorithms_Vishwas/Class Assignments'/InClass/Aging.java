package InClass;
//Encapsulation
public class Aging {
    private String Name;
    private int Age;

    public void getData(){
        System.out.println(Name+" "+Age);
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public void setAge(int Age){
        this.Age=Age;
    }


//    public static void main(String[] args) {
//        Aging a=new Aging();
//        a.Name="Vishwas";
//        System.out.println(a.Name);
//    }
}
