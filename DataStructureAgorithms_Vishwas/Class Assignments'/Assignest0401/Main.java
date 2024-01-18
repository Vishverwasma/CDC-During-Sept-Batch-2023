package Assignest0401;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        String name,area,city,state;
        int dd,mm,yy;
        System.out.println( " Name : " );
        name=n.nextLine();
        System.out.println( " Area : " );
        area=n.nextLine();
        System.out.println( " City : " );
        city=n.nextLine();
        System.out.println( " State : " );
        state=n.nextLine();
        System.out.println( " Date Of Birth : " );
        dd=n.nextInt();
        System.out.println( " Month Of Birth : " );
        mm=n.nextInt();
        System.out.println( " Year Of Birth : " );
        yy=n.nextInt();
        System.out.println( "*Your Details In Printed Format Is : " );
        Person p=new Person(name,area,city,state,dd,mm,yy);
        p.DisplayDetails();
    }
}
