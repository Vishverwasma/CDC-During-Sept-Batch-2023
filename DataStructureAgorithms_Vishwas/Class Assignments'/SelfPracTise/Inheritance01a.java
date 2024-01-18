package SelfPracTise;

public class Inheritance01a extends Inheritance01{// Child Or Sub Class
    String ModelType;;
    public void showDetails(){
        VehicleType="Bike";
        ModelType="Sports";
        System.out.println(ModelType+" "+VehicleType);
    }

    public static void main(String[] args) {
        Inheritance01a bike=new Inheritance01a();
        bike.showDetails();
    }
}
