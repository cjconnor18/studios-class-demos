package com.company.studios.studio4.anotherExample;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    //Constructors, Overloaded, empty
    public Menu(ArrayList<MenuItem> aMenuItems, Date lastUpdated) {
        this.menuItems = aMenuItems;
        this.lastUpdated = lastUpdated;
    }

    public Menu(ArrayList<MenuItem> aMenuItems) {
        this(aMenuItems, new Date());
    }

    public Menu() {
        this(new ArrayList<MenuItem>());
    }

    //methods
    public void printMenu() {
        ArrayList<MenuItem> appetizers = new ArrayList<>();
        ArrayList<MenuItem> main = new ArrayList<>();
        ArrayList<MenuItem> desserts = new ArrayList<>();

        for(MenuItem item : menuItems) {
            if(item.getCategory().equals("appetizer")) {
                appetizers.add(item);
            } else if(item.getCategory().equals("main")) {
                main.add(item);
            } else if(item.getCategory().equals("dessert")) {
                desserts.add(item);
            }
        }

        System.out.println("\nRestaurant Menu (Last Updated: " + this.lastUpdated + ")");
        System.out.println("\tAppetizers");
        MenuItem.printHeading();
        printCategory(appetizers);

        System.out.println("\n\tMain Course");
        MenuItem.printHeading();
        printCategory(main);

        System.out.println("\n\tDesserts");
        MenuItem.printHeading();
        printCategory(desserts);

    }

    private void printCategory(ArrayList<MenuItem> items) {
        if(items.size() > 0) {
            for(MenuItem item : items) {
                item.printOne();
            }
        } else {
            System.out.println("Nothing listed. Check back later!");
        }
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
        updateDateLastUpdated();
    }

    public void removeItem(MenuItem item) {
        if(menuItems.contains(item)) {
            menuItems.remove(item);
            updateDateLastUpdated();
        }
    }

    private void updateDateLastUpdated() {
        this.lastUpdated = new Date();
    }

    //Getters and Setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    /*
don't really need a setter for lastUpdated; anytime updates are made to menu, we have a private method to do this.
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
*/
}
