package Assignest0402;
import java.util.*;
public class Bank {
    public static void main(String[] args) {

        String name;
        Scanner ab=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter Your Name : ");
        name=ab.nextLine();

        System.out.println();
        System.out.print("Enter Your Account Number : ");
        int acc=ab.nextInt();

        System.out.println();
        System.out.print("Enter Your Depositing Amount : ");
        float deposit=ab.nextInt();


        float rate=0.05f;

        float balance=100000;

        SavingAccount sa=new SavingAccount();
        sa.Deposit(deposit,balance);
        System.out.println("The Final balance of Account user : "+name );
        sa.Display();
    }
}
