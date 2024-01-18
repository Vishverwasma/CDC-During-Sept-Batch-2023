package SelfPracTise;

public class MultiLvlIneritance01b extends MultiLvlIneritance01a {
    public void method3(){
        System.out.println("Class MultiLvlIneritance01b is called ! ");
    }

    public static void main(String[] args) {
        MultiLvlIneritance01b b=new MultiLvlIneritance01b();
        b.method1();
        b.method2();
        b.method3();
    }
}
