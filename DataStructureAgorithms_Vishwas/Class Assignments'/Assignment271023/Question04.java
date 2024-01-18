package Assignment271023;
import java.util.*;
public class Question04 {
    public static void main(String[] args) {
        int n;
        ArrayList<String> c = new ArrayList<String>();
        c.add("Violet");
        c.add("Indigo");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Orange");
        c.add("Red");
        System.out.println("VIBGYOR : ");
        System.out.println("________");
        System.out.println(c);
        System.out.println("________");
        System.out.println("The Index You WIsh To See Element Of : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n < c.size()) {
            System.out.println("________");
            System.out.println("Value at index : " + n + " : " + c.get(n));
        }
        else{
            System.out.println("Invalid Entry ! ");
        }
    }
}