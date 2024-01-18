package DataStructureAgorithms_Vishwas;
import java.sql.SQLOutput;
import java.util.*;
public class UserOfArrayOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Whats The Size Of Array You Wish To Make : ");
        int s=sc.nextInt();
        ArrayOperations a=new ArrayOperations(s);
        int ch=0;
        do{
            System.out.println("You Have To Opt For The Choice You Wish To Go On With Among : ");
            System.out.println("1. Read Array Elements");
            System.out.println("2. Print");
            System.out.println("3. Left Shift");
            System.out.println("4. Right Shift");
            System.out.println("5. Left Rotate");
            System.out.println("6. Right Rotate");
            System.out.println("7. Insert On Position");
            System.out.println("8. Delete From Position");
            System.out.println("9. Remove Duplicates01");
            System.out.println("10. Remove Duplicates02");
            System.out.println("11. Remove Duplicates03");
            System.out.println("12.  Exit");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("What Do Your Wish to Opt For : ");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    a.ReadArray();
                    break;
                case 2:
                    a.printArrayElements();
                    break;
                case 3:
                    a.leftShift();
                    a.printArrayElements();
                    break;
                case 4:
                    a.rightShift();
                    a.printArrayElements();
                    break;
                case 5:
                    a.leftRotate();
                    a.printArrayElements();
                    break;
                case 6:
                    a.rightRotate();
                    a.printArrayElements();
                    break;
                case 7:
                    a.printArrayElements();
                    System.out.print("What Position Do You Wish To Insert Value At : ");
                    int pos=sc.nextInt();
                    System.out.println("And The Value : ");
                    int val=sc.nextInt();
                    a.insert_by_position(pos,val);
                    a.printArrayElements();
                    break;
                case 8:
                    a.printArrayElements();
                    System.out.println("Position From Where You Wish To Delete From : ");
                    int posi=sc.nextInt();
                    System.out.println("The Deleted value is : "+a.delete_by_position(posi));

                    a.printArrayElements();
                    break;
                case 9:
                    a.printArrayElements();
                    a.removeDuplicateVersion01();
                    a.printArrayElements();
                    break;
                case 10:
                    a.printArrayElements();
                    a.removeDuplicateVersion02();
                    a.printArrayElements();
                    break;
                case 11:
                    a.printArrayElements();
                    a.removeDuplicateVersion03();
                    a.printArrayElements();
                    break;
                default:
                    if(ch==12){
                        System.out.println("You Opted To Exit");
                    }
                    else{
                        System.out.println("Your Input is Out Of Range");
                        ch=12;
                    }
            }
        }while(ch!=12);
    }
}
