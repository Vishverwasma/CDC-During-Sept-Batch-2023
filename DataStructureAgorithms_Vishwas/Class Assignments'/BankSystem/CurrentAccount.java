package BankSystem;

import static java.lang.Math.*;

public class CurrentAccount implements BankAccount{
    SavingsAccount sa=new SavingsAccount();
    float balance=sa.balance;
     float deposit,withdraw;
    public void setInterest(float balance){}
    public void DisplayAccountDetails(){}
    public void setBalance(float balance){
        this.balance=balance;
    }
    public void setDeposit(float deposit){
        this.deposit=deposit;
        System.out.println(deposit);
    }
    public void setWithdraw(float withdraw){

        this.withdraw=withdraw;
        System.out.println(withdraw);
    }
    public void setBalance(){
        this.balance=this.balance+this.deposit-this.withdraw;
        System.out.println("Bal1 : "+balance);
    }
    public void changeBalance(float balance){}
    public void DisplayBankBalance(){
        System.out.println("The Withdrawl Amount of "+this.withdraw +" and The deposit amount of "+this.deposit+" That made the Balance to raise by amount "+(this.balance-this.withdraw+this.deposit));
    }
}
