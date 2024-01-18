package Assignest03Q1;

public class Account {
    public float balance;
    public Account(){
        balance=50000f;
    }
    public Account(float balance){
        this.balance=balance;
    }
    public void ShowBalance(){
        System.out.println(" "+balance);
    }
    public void ShowBalance(char ch){
        System.out.println(" "+ch+balance);
    }
}
