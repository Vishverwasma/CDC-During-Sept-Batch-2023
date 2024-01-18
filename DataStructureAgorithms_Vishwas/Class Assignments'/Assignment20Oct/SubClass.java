package Assignment20Oct;

public class SubClass extends AbstractXYZ{
    public void a_method(){
        System.out.println("This is the Abstract Method ! ");
    }

    public static void main(String[] args) {
        SubClass a=new SubClass();
        a.a_method();
        a.b_method();

    }
}
