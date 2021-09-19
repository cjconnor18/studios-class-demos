package com.company.studios.studio4.inClassStudio;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    //Constructors
    public Menu(ArrayList<MenuItem> aMenuItems, Date lastUpdated) {
        this.menuItems = aMenuItems;
        this.lastUpdated = lastUpdated;
    }

    public Menu(ArrayList<MenuItem> aMenuItems) {
        this(aMenuItems, new Date());
    }

    public Menu() {}

    public ArrayList<MenuItem> addItem(MenuItem aItem) {
        this.menuItems.add(aItem);
        return this.menuItems;
    }

    public ArrayList<MenuItem> removeItem(MenuItem aItem) {
        boolean hasItem = false;
        for(MenuItem item : this.menuItems) {
            if(item.equals(aItem)) {
                hasItem = true;
            }
        }
        if(hasItem) {
            this.menuItems.remove(aItem);
        }

        return this.menuItems;
    }

    private void printLastUpdated() {
        System.out.print("Last updated: " + this.lastUpdated);
    }

    public void printMenu() {
        for (MenuItem item : this.menuItems) {
            System.out.println(item.toString());
            System.out.println("****************");
        }
        printLastUpdated();
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

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
