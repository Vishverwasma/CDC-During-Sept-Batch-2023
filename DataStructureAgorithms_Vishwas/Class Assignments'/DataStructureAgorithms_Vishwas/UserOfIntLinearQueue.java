package DataStructureAgorithms_Vishwas;
import java.util.*;
public class UserOfIntLinearQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Size Of Your Stack : ");
        size=sc.nextInt();
        IntLinearQueue i=new IntLinearQueue(size);
        int ch=0;
        do{
            System.out.println("Menu : \n1.Insert\n2.Delete\n3.Peek\n4.Exit");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    int a,j;
                    System.out.println("Insert Option was Opted !");
                    System.out.println("Your EnQueueing Elements are : ");
                    for(j=0;j<size;j++){
                        a= sc.nextInt();
                        i.enQueue(a);
                    }
                    i.Display();
                    System.out.println();
                break;
                case 2:
                    System.out.println("You Opted To Delete An Element From This Linear Queue : ");
                    System.out.println(i.deQueue());
//                    i.Display();
                    System.out.println();
                break;
                case 3:
                    System.out.println("You Opted To Peek At The Element at The Top That is : ");
                    System.out.print(i.peek());
                    System.out.println();
                break;
                default:
                    if(ch==4) {
                        System.out.println("So you Opted To Quit So Go and Take Rest And Try Again !");
                    }else{
                        System.out.println("Seems Like You Have Taken A lot of Drugs , Go And Come Back When You Are Concious ! ");
                    }
                    break;
            }
        }while(ch!=4);
    }
}
