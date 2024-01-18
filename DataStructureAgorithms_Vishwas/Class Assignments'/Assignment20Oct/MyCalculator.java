package Assignment20Oct;

public class MyCalculator implements AdvancedArithmetic{
    int num;
    public void setNum(int n){
        this.num=n;
    }
    public void getNum(){
        int i=1,sum=0;
        for(i=1;i<num;i++) {
            if(num%i==0) {
                sum=sum+i;
                System.out.println(i);
            }
        }
        System.out.println("The Sum  Of "+num+" divisors is "+sum);
    }
}
