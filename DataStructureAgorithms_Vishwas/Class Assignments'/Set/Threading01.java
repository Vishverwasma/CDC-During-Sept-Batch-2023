package Set;

public class Threading01 extends Thread{
    public void run(){
        System.out.println("I am running Thread");
    }

    public static void main(String[] args) {
        Threading01 m=new Threading01();
        m.start();
    }
}
