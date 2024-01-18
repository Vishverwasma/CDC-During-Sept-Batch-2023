package DataStructureAgorithms_Vishwas;
import java.util.*;
public class UserOfIntStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch,size;
        System.out.println("Welcome To The menu Driven Int Stack Program !");
        System.out.println("----------------------------------------------");
        System.out.println("What is the Size os Stack You Wish to Enter :: ");
        size=sc.nextInt();
        IntStack is=new IntStack(size);
        do{
            System.out.println("Enter your Choice From The Menu : ");
                System.out.println("-----Menu----- \n0.Enter Values In Stack\n1.Push\n2.Pop\n3.Peek\n4.Exit");
                ch = sc.nextInt();
                switch (ch) {
                    case 0:
                        System.out.println("Element You Wish to Enter In The Stack : ");
                        int i;
                        for(i=0;i<size-1;i++){
                            int val=sc.nextInt();
                            is.push(val);
                        }
                        break;
                    case 1:
                        int Value;
                        System.out.println("Element You Wish to Push Into The Stack : ");
                        Value = sc.nextInt();
                        is.push(Value);
                        is.Display();
                        break;
                    case 2:
                        System.out.println("Poping ut The Element Form The Top of This Stack :: ");
                        is.pop();
                        is.Display();
                        break;
                    case 3:
                        System.out.println("Peeking into the Stack without Removing..Hmm.");
                        System.out.println(is.peek());
                        break;
                    case 4:
                        System.out.println("You Opted To Exit The Program, but You Will Loose This Below Stack :: ");
                        is.Display();
                        break;
                    default:
                        System.out.println("The Input You entered Crosses the Range Of What We Expect You to enter !");
                        ch = 4;
                        break;
            }
        }while(ch!=4);
    }
}
