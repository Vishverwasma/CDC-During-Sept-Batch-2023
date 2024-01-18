package VishwasINFOWAY;

import java.util.*;

public class Restaurant {
    ArrayList<String> MenuItems = new ArrayList<String>();
    ArrayList<Double> Prices = new ArrayList<Double>();
    ArrayList<Double> rating = new ArrayList<Double>();

    public Restaurant() {
        MenuItems.add("\0");
        Prices.add(0d);
        rating.add(0d);
    }

    /*Parameterized Constructor For Adding Values To all ArrayLists*/
    public Restaurant(String MenuItem, double Prices, double rating) {
        this.MenuItems.add(MenuItem);
        this.Prices.add(Prices);
        this.rating.add(rating);
    }

    /*Adding items and  details to Menu*/
    public void add(String MenuItem, double Prices) {
        this.MenuItems.add(MenuItem);
        this.Prices.add(Prices);
    }
    public void addrating(double rating){
        this.rating.add(rating);
    }

    /*Removal of items and  details from Menu*/
    public void remove(String MenuItem) {
        for (String n : this.MenuItems) {
            if (MenuItem == n) {
                this.MenuItems.remove(MenuItem);
                this.Prices.remove(this.MenuItems.indexOf(MenuItem));
                this.rating.remove(this.MenuItems.indexOf(MenuItem));
                break;
            }
            else if(MenuItem!=n){
                System.out.println("You Dont Know Whats In The Menu. Please Do Retry !");

            }
        }
    }


    public void DisplayMenu() {
        System.out.println("______________:Current MENU :_______________");
        System.out.println("Items in Menu" + "  " + "Prices" + " " + "Ratings");
        System.out.println();
        Iterator n=this.MenuItems.iterator();
        Iterator p=this.Prices.iterator();
        Iterator ra=this.rating.iterator();
        while(n.hasNext()){
            System.out.println(n.next()+" - "+p.next()+" - "+ra.next());
        }
    }

    /*Method to Calculate average Rating*/
    public double AverageRating(ArrayList<Double> rating) {
        double average = 0;
        for (double i : this.rating) {
            average = average + i;
        }
        average = average / (rating.size());
        return average;
    }
}
