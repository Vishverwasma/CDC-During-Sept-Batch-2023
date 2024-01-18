package BankSystem;

public class SavingsAccount implements BankAccount{

     float interest,balance;
    public void setDeposit(float deposit){}
    public void setWithdraw(float withdraw){}
    public void setBalance(){}
    public void DisplayBankBalance(){}


    public void setBalance(float balance){
        this.balance=balance;
    }


    public void setInterest(float balance){

        this.interest=balance*0.1f;
    }


    public void getBalance(){
        this.balance=this.balance+this.interest;
    }


    public void DisplayAccountDetails(){
        this.balance=this.balance+interest;
        System.out.println(" interest of "+interest+" and Balance in Saving Account is "+balance);
    }
    public void changeBalance(float balance){
        this.balance=balance;
    }
}
