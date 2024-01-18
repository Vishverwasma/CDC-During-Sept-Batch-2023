package BankSystem;
import java.util.*;
public class Bank {
    public static void main(String[] args) {

        float interest, balance, deposit, withdraw;
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Expected Balance Amount of : ");
        balance=sc.nextFloat();


        BankAccount ba1 = new SavingsAccount();
        ba1.setInterest(balance);
        ba1.setBalance(balance);
        ba1.DisplayAccountDetails();
        ba1.changeBalance(balance);
        System.out.println("When the balance is : "+balance+" so ");


        System.out.println("Deposit Amount of : ");
        deposit = sc.nextFloat();
        System.out.println("WithDrawl Amount of : ");
        withdraw = sc.nextFloat();
        BankAccount ba2 = new CurrentAccount();
        ba2.setBalance(balance);
        ba2.setDeposit(deposit);
        ba2.setWithdraw(withdraw);
        ba2.setBalance();
        ba2.DisplayBankBalance();
    }

}
