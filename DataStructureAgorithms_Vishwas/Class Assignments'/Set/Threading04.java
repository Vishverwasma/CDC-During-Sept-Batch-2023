package Set;

public class Threading04 extends Thread{
    public void run(){
        int i;
        for(i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Threading04 t1=new Threading04();
        Threading04 t2=new Threading04();
        Threading04 t3=new Threading04();
        t1.start();
        t2.start();
        t3.start();
    }
}
