package InClass;
import java.util.*;
public class E02main {
    public static void main(String[] args) {
        Encapsulation02 e=new Encapsulation02();
        String name;
        int age,n;
        Scanner sc=new Scanner(System.in);

            name=sc.nextLine();
            e.setName(name);
            age = sc.nextInt();
            e.setAge(age);
            e.getData(name,age);

    }
}
