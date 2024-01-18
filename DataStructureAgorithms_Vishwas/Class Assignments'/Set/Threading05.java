package Set;

public class Threading05 extends Thread{
    public void run(){
        System.out.println("Thread....");
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Threading05 m1=new Threading05();
        Threading05 m2=new Threading05();
       // Threading05 m3=new Threading05();
        m1.run();
        m1.start();
        m2.run();
        m2.start();

    }
}
