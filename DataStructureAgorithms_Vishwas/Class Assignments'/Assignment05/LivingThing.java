package Assignment05;

public class LivingThing {
    public void Species(){
        System.out.println();
    }
    public static void main(String[] args) {
        LivingThing lt;
        lt=new Humans();
        lt.Species();
        lt=new Animals();
        lt.Species();
        lt=new Plants();
        lt.Species();
        lt=new Bacteria();
        lt.Species();
    }
}
