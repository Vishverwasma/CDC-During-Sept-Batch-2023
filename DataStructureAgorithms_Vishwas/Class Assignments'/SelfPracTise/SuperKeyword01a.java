package SelfPracTise;

public class SuperKeyword01a extends SuperKeyword01{
    String name;
    public void Details(){
        super.name="Parent";
        name="Child";
        System.out.println(super.name+" and "+name);
    }

    public static void main(String[] args) {
        SuperKeyword01a child=new SuperKeyword01a();
        child.Details();
    }
}
