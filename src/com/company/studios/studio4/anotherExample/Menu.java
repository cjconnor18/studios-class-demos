package com.company.studios.studio4.anotherExample;

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
