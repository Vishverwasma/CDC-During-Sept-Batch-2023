package Assignment271023;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.addAll;
public class Question15 {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>();
        c.add("Violet");
        c.add("Indigo");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Orange");
        c.add("Red");
        System.out.println("The First Batch Of Colours : ");
        System.out.println();
        System.out.println(c);

        ArrayList<String> d = new ArrayList<String>();
        d.add("Purple");
        d.add("Pink");
        d.add("Blue");
        d.add("Red");
        d.add("Brown");
        d.add("Black");
        d.add("Yellow");
        d.add("White");
        System.out.println("The Other Batch Of Colours : ");
        System.out.println(d);


        c.addAll(d);
        System.out.println("After Merging This Two Arraly LIsts : ");
        System.out.println(c);
    }
}
