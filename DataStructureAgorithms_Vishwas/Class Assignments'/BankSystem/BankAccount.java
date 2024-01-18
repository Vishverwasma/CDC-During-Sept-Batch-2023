package BankSystem;

public interface BankAccount {
    //Interest
    public void setInterest(float balance);
    public void DisplayAccountDetails();
    public void setBalance(float interest);
    //Current
    public void setDeposit(float deposit);
    public void setWithdraw(float withdraw);
    public void setBalance();
    public void DisplayBankBalance();
    public void changeBalance(float balance);
}
