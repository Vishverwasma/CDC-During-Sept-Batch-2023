package SelfPracTise;

public class SuperKeyword02a extends SuperKeyword02 {
    String Name;
    public void Details(){
        super.Details();
        Name="Child";
        System.out.println(Name);
    }

    public static void main(String[] args) {
        SuperKeyword02a child=new SuperKeyword02a();
        child.Details();
    }
}
