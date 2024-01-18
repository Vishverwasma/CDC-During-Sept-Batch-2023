package Assignest03Q1;

public class Person {
    private String name;
    private Date bdate;
    private Account acbal;
    public Person(){
        name=new String(" ");
        bdate=new Date();
        acbal=new Account();
    }
    public Person(String name,int dd,int mm,int yy,float balance){
        this.name=name;
        this.bdate=new Date(dd,mm,yy);
        this.acbal=new Account(balance);
    }
    public void Display(){
        System.out.println("Name : "+this.name);
        if(bdate!=null){
            System.out.println("BirthDate : ");
            bdate.ShowDate();
            System.out.println("Account Balance : ");
            acbal.ShowBalance();
        }
    }
}
