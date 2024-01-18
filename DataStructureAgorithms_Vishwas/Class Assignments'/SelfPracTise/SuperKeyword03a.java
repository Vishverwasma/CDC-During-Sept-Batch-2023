package SelfPracTise;

public class SuperKeyword03a extends SuperKeyword03 {
    String Name;
    public SuperKeyword03a(String Name1,String Name2){
        super(Name1);
        this.Name=Name2;
    }
    public void Details(){
        System.out.println(super.Name+" and "+Name);
    }

    public static void main(String[] args) {
        SuperKeyword03a child=new SuperKeyword03a("Parent","Child");
        child.Details();
    }
}
