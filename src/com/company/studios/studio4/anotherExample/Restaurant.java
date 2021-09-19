package com.company.studios.studio4.anotherExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Restaurant {
    public static void main(String[] args) throws InterruptedException {
        MenuItem steak = new MenuItem(12.99, "Ribeye", "main", false);
        MenuItem steak2 = new MenuItem(15.99, "T-Bone", "main", false);
        MenuItem steak3 = new MenuItem(17.99, "KC Strip", "main", false);
        MenuItem iceCream = new MenuItem(2.99, "Strawberry Ice Cream", "dessert", false);
        MenuItem iceCream2 = new MenuItem(2.99, "Vanilla Ice Cream", "dessert");
        MenuItem iceCream3 = new MenuItem(2.99, "Chocolate Ice Cream", "dessert", false);
        MenuItem app = new MenuItem(5.99, "Fried Pickles", "appetizer");
        MenuItem app2 = new MenuItem(4.99, "Queso and Chips", "appetizer", false);
        MenuItem app3 = new MenuItem(5.99, "Salad", "appetizer", false);

        Menu menu = new Menu();

        menu.addItem(steak);
        menu.addItem(steak2);
        menu.addItem(steak3);
        menu.addItem(iceCream);
        menu.addItem(iceCream2);
        menu.addItem(iceCream3);
        menu.addItem(app);
        menu.addItem(app2);
        menu.addItem(app3);

        menu.printMenu();



// the next line is just adding a delay so we can look at time signature in lastUpdated
        TimeUnit.SECONDS.sleep(50);
        menu.removeItem(app2);
        menu.removeItem(steak2);

        menu.printMenu();

    }


}
