package SelfPracTise;

public class Aggregation02 {
    int id;
    String name;
    Aggregation01 address;
    public Aggregation02(int id,String name,Aggregation01 address){
        this.name=name;
        this.id=id;
        this.address=address;
    }
    void showDetails(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Aggregation01 add1=new Aggregation01("Mumbai","Maharashtra","India");
        Aggregation01 add2=new Aggregation01("Surat","Gujarat","India");
        Aggregation02 stu1=new Aggregation02(111,"Vishwas",add1);
        Aggregation02 stu2=new Aggregation02(123,"Nucler",add2);
        stu1.showDetails();
        stu2.showDetails();
    }
}
