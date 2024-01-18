package DataStructureAgorithms_Vishwas;
import java.util.*;
public class UserOfCircularQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch,size;
        System.out.println("Size of Your Queue Is : ");
        size=sc.nextInt();
        CircularQueue c=new CircularQueue(size);
        do{
            System.out.println("Menu -- \n1.Insert\n2.Delete\n3.Peek\n4.Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    int a;
                    System.out.println("Insert Option was Opted !");
                    System.out.println("Your EnQueueing Elements are : ");
                    int i;
                    for(i=0;i<size;i++){
                        a=sc.nextInt();
                        c.enQueue(a);
                    }
                    c.Display();
                    break;
                case 2:
                    System.out.println("So You Opted To Delete The Value From The Top Of The Queue : ");
                    System.out.println(c.deQueue());
                    break;
                case 3:
                    System.out.println("So You Opted To Peek On The Top Element of Your Queue : ");
                    System.out.println("And That Element in The Top Of The Queue is : "+c.peek());
                    break;
                default:
                    if(ch==4){
                        System.out.println("So you Opted To Quit !");
                    }
                    else{
                        System.out.println("Seems Like You Need Rest ,As You Cant Read Properly RN !");
                        ch=4;
                    }
                    break;
            }
        }while(ch!=4);
    }
}
