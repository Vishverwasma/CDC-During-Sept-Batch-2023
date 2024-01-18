package Set;

public class Threading03 {
    public static void main(String[] args) {
        Thread t=new Thread("I am Thread");
        t.start();
        String str=t.getName();
        System.out.println(str);
    }
}
