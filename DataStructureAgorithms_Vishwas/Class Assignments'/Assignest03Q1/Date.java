package Assignest03Q1;

import java.sql.SQLOutput;

public class Date {
    int dd,mm,yy;
    static int count=0;
    public Date(){
        dd=20;
        mm=3;
        yy=2001;
        count++;
    }
    public Date(int dd,int mm,int yy){
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
        count++;
    }
    public Date(int n){
        dd=mm=yy=n;
    }
    public void ShowDate(){
        System.out.println(dd+"/"+mm+"/"+yy);
    }
    public void ShowDate(char ch){
        System.out.println(dd+"/"+ch+mm+"/"+ch+yy);
    }
    public static void ShowCount(){
        System.out.println("Count of object : "+count);
    }
}
