package Assignest0402;

public class SavingAccount {
    public float amount,balance,rate=0.005f;
    public void Deposit() {

        System.out.println("Enter The Depositing Amount : ");
    }
    public void Deposit(float amount,float balance){
        this.amount=amount;
        this.balance=balance+(amount-(amount*rate));
    }
    public void Display(){
        System.out.print(" with rate of "+rate+" % on depositing a amount of "+amount+" with amount deducted due to rate "+(amount*rate)+" is "+balance);
    }
}
