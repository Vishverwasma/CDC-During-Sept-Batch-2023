package Basic_OOPS;

public class Student {
    int id;
    String name;
    int age;
    void Display(String n,int a,int i){
        System.out.println(n+" "+a+" "+i);
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.Display(s.name,s.age,s.id);
    }
}
