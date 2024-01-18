package DataStructureAgorithms_Vishwas;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class UserLinkedList {
    public static void main(String[] args) {
/*     Of Day 02
        LinkedList l = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Menu \n1.InsertFront\n2.InsertLast\n3.Exit");
            System.out.println("What Do You Wish To Do : ");
            ch=sc.nextInt();
            int i, val, lav;
            switch(ch) {
                case 1:
                System.out.println("Number of Time (Keep It Short If You Just Wanna Test This Program) You Wanna Insert Some Input : ");
                int n = sc.nextInt();
                System.out.println("The Values To Insert : ");
                for (i = 0; i < n; i++) {
                    val = sc.nextInt();
                    l.insertFirst(val);
                }
                System.out.println("the Elements In Your Queue Comes Out to BE : ");
                l.Display();
                    System.out.println();
                break;
                case 2:
                System.out.println("The Number (Same Please Do Keep It Short ) Of Items You Wish To Insert in Last : ");
                int m = sc.nextInt();
                System.out.println("Enter The Values : ");
                for (i = 0; i < m; i++) {
                    lav = sc.nextInt();
                    l.insertLast(lav);
                }
                System.out.println("the Elements In Your Queue Coj=mes Out to BE : ");
                l.Display();
                    System.out.println();
                break;
                default:
                    System.out.println("If You pressed 3 or Other Value It means You Wanna Quit, But its Not A Good Bye, see You Soon Warrior 1");
                    ch=3;
                    System.out.println();
                    break;
            }
        }while(ch!=3);
*/
// Day 03
        LinkedList l=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int ch,data,pos,cnt;
        do{
            System.out.println("Menu : \n1.InserFirst\n2.InsertLast\n3.InsertByPosition\n4.InsertBeforeData\n5.DeleteFirst\n6.DeleteLast\n7.DeleteByPosition\n8.CountNumberOfNodes\n9.SortedInsert\n10.Display\n11.Exit\n");
            System.out.println("What Do You Wish To Opt For : ");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("You Have Opted To : Insert at First");
                    System.out.println("Enter Data You Wish To Insert : ");
                    data= sc.nextInt();
                    l.insertFirst(data);
                    break;
                case 2:
                    System.out.println("You Have Opted To : Insert at Last");
                    System.out.println("Enter Data You Wish To Insert : ");
                    data= sc.nextInt();
                    l.insertLast(data);
                    break;
                case 3:
                    System.out.println("You Have Opted To : Insert By Position");
                    System.out.println("Enter Data You Wish To Insert : ");
                    data= sc.nextInt();
                    System.out.println("Enter Position You Wish To Enter At : ");
                    pos= sc.nextInt();
                    l.insertByPosition(data,pos);
                    break;
                case 4:
                    System.out.println("You Have Opted To : Insert Before Data");

                    break;
                case 5:
                    System.out.println("You Have Opted To : Delete First");
                    data=l.deleteFirst();
                    System.out.println("Delete Data Is : "+data);
                    break;
                case 6:
                    System.out.println("You Have Opted To : Delete Last");
                    data=l.deleteLast();
                    System.out.println("Delete Data Is : "+data);
                    break;
                case 7:
                    System.out.println("You Have Opted To : Delete By Position");
                    System.out.println("Enter Position You Wish To Delete Value From : ");
                    pos= sc.nextInt();
                    data=l.deleteByPosition(pos);
                    System.out.println("Delete Data Is : "+data);
                    break;
                case 8:
                    System.out.println("You Have Opted To : Count Number Of Elements");
                    l.CountElements();
                    break;
                case 9:
                    System.out.println("You Have Opted To : Sorted Insert");
                    System.out.println("Enter Data You Wish To Insert : ");
                    data= sc.nextInt();
                    l.insertSorted(data);
                    break;
                case 10:
                    System.out.println("You Have Opted To : Display");
                    l.Display();
                    System.out.println("You have Opted To : String Display");
                    System.out.println(l.to_String());
                    break;
                default :
                    System.out.println("You Have Opted For 11th Choice or Have Opted For Choice Out Of Range");
                    ch=11;
                    break;
            }
        }while(ch!=11);
        System.out.println("See You Soon ! Sayonara ! ");
    }
}
