package Basic_OOPS;
import java.util.*;
public class Bank
{
    double rate;
    int time;
    float total_amount;
    public Bank(){
        System.out.println("Default Constructor was Called !");
        rate=(float)0;
        time=0;
        total_amount=0;
    }
    public Bank(double rate,int time,float ta){

        System.out.println("Parameterized Constructor is called with all Variables!");
        this.rate=rate;
        this.time=time;
        this.total_amount=ta;
    }

    public float FixedDeposit() {
        float FD;
        System.out.println("FixedDeposit is Called");
        FD=total_amount+(total_amount*(float)rate*(float)time/100);
        return FD;
    }

    public static void main(String[] args) {
        float ta;
        Scanner at=new Scanner(System.in);
        ta=at.nextFloat();
        double r=0.072;
        int t=3;
        Bank b1=new Bank(r,t,ta);
        System.out.println("Our Fixed Amount After A Duration Of 7 Years With Rate of Interest as 7.2% is : "+b1.FixedDeposit());
    }
}
