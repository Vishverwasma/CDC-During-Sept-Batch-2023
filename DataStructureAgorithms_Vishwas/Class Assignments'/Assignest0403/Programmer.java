package Assignest0403;

public class Programmer {
    int id;
    String Specialization;
    float salary;
    public Programmer(){
        id=00;
        Specialization="\0";
        salary=0.00f;
    }
    public Programmer(int id,String Specialization,float salary){
        this.id=id;
        this.Specialization=Specialization;
        this.salary=salary;
    }
    public void ShowInfo(){
        System.out.println(id+" with Specialization in "+Specialization+" and Salary Of "+salary);
    }
}
