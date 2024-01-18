package VishwasINFOWAY;
import java.util.*;
public class DogMain {
    public static void main(String[] args) {
        Dog d=new Dog();
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Your Dogs NAme : ");
        String name=in.next();
        System.out.println("Please Enter Your Dogs Breed : ");
        String breed=in.next();
        d.setter(name,breed);
        d.getter();
    }
}
