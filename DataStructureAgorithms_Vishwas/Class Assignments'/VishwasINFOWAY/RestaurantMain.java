package VishwasINFOWAY;

import java.util.*;
public class RestaurantMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,user;
        String item="\0";
        double price=0.0d,rating=0;
        double m;

        ArrayList<Double> rate=new ArrayList<Double>();
        Restaurant r=new Restaurant();
        System.out.println("Number Of Entries You Wanna Give : ");
        n=in.nextInt();
        for(int i=0;i<n;i++) {
            m=0;
            System.out.println("Item " + (i + 1) + " Name : ");
            item = in.next();
            System.out.println("Item " + (i + 1) + " Price : ");
            price = in.nextDouble();
            r.add(item,price);

            System.out.println("Number of Users : ");
            user=in.nextInt();
            for(int j=0;j<user;j++){
                rate.removeAll(rate);

                System.out.println(" Rating From User " + (j + 1) + " out of 10 : ");
                rating = in.nextDouble();
                if (rating <= 10) {
                    rate.add(rating);
                }
                else{
                    System.out.println("Invalid Rating please Try Again !");
                }
                m=r.AverageRating(rate);
                r.addrating(m);
            }
            r.DisplayMenu();
            System.out.println();
        }
        System.out.println("Do You Wish To Remove Something From The Current Menu : 0 for Yes/1 for No :");
        int choice;
        String removal;
        choice=in.nextInt();
        if(choice==0){
            System.out.println("So You Opted To Remove an Item From The Menu !");
            System.out.println("Menu Item You Wish To remove is : ");
            removal=in.next();
            r.remove(removal);
        }
        else if(choice==1){
            System.out.println("Thanks For Saving Yours and Our Time ! ");

        }
        System.out.println("After Removal Your Menu List Comes Out To Be : ");
        r.DisplayMenu();
    }
}
