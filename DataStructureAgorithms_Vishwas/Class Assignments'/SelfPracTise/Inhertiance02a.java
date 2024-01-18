package SelfPracTise;

public class Inhertiance02a extends Inhertiance02{
    public void method2(){
        System.out.println("Child Class Method ! ");
    }

    public static void main(String[] args) {
        Inhertiance02a b=new Inhertiance02a();
        b.method1();   //calling Super class method
        b.method2();   //calling Child class method
    }
}
