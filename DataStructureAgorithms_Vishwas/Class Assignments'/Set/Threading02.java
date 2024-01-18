package Set;

public class Threading02 implements Runnable{
    public static void main(String[] args) {
        Threading02 m=new Threading02();
        Thread t1=new Thread(m);
        t1.start();
    }
    @Override public void run(){
        System.out.println("I am Thread");
    }
}
