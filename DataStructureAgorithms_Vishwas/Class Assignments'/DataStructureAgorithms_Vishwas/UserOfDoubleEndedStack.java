package DataStructureAgorithms_Vishwas;
import java.util.*;
public class UserOfDoubleEndedStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of Array you Wished To Create : ");
        int n=sc.nextInt();
        int ch;
        DoubleEndedStack de=new DoubleEndedStack(n);
        do{
            System.out.println("Menu : \n1.PushA\n2.PushB\n3.PopA\n4.PopB\n5.PeekA\n6.PeekB\n7.Exit");
            ch=sc.nextInt();
            switch (ch){

                case 1:
                    int d=sc.nextInt();
                    de.pushA(d);
                    System.out.println("Size : "+de.SizeOfArray());
                    break;
                case 2:
                    int e=sc.nextInt();
                    de.pushB(e);
                    System.out.println("Size : "+de.SizeOfArray());
                    break;
                case 3:
                    System.out.println(de.popA());
                    System.out.println("Size : "+de.SizeOfArray());
                    break;
                case 4:
                    System.out.println(de.popB());
                    System.out.println("Size : "+de.SizeOfArray());
                    break;
                case 5:
                    System.out.println(de.peekA());
                    System.out.println("Size : "+de.SizeOfArray());
                    break;
                case 6:
                    System.out.println(de.peekB());
                    System.out.println("Size : "+de.SizeOfArray());
                    break;
                default:
                    if(ch==7) {
                        System.out.println("Seems You Opted The Best Options, Go and Smoke as A Treat From Me!");
                    }else {
                        System.out.println("The Value You Entered Is Invalid So I Think You Should Go Take Some Smoke ! ");
                        }ch = 7;
                    break;
            }
        }while(ch!=7);
    }
}
