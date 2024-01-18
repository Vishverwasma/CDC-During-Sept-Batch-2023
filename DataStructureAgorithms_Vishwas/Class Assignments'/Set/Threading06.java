package Set;

public class Threading06 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Threading06 m1=new Threading06();
        Threading06 m2=new Threading06();
        m1.start();
        try{
            m1.join(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        m2.start() ;
    }
}
