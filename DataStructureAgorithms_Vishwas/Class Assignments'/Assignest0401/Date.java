package Assignest0401;

public class Date {
    int dd,mm,yy;
    static int count=0;
    public Date(){
        //Default Constructor
        dd=03;
        mm=20;
        yy=2001;
    }
    public Date(int dd,int mm,int yy){
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
    }
    public void ShowDate(){
        System.out.println("BirthDate :  "+dd+" / "+mm+" / "+yy+" ");
    }
}
