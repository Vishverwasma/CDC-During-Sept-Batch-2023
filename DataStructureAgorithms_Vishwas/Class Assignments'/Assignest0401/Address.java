package Assignest0401;

public class Address {
    String area,city,state;
    public Address(){
        area="Surya-Nagar";
        city="Durg";
        state="Chhattisgarh";
    }
    public Address(String area, String city,String state){
        this.area=area;
        this.city=city;
        this.state=state;
    }
    public void ShowAddress(){
        System.out.println("Address : "+area+" , "+city+" , "+state+" . ");
    }
}
