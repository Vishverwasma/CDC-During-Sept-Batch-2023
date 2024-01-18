package VishwasINFOWAY;

public class Dog {
    String name;
    String breed;
    public Dog(){
        name="Tommy";
        breed="German Sheferd";
    }
    public void setter(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    public void getter(){
        System.out.println("This is "+this.name+" and I am of Breed "+this.breed);
    }
}
