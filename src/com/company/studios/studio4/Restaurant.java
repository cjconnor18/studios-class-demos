package com.company.studios.studio4;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem newItem = new MenuItem("French Fries", 2.50, "greasy", "appetizer", false);
        MenuItem newItem2 = new MenuItem("Steak", 12.50, "Ribeye", "main");

        ArrayList<MenuItem> newList = new ArrayList<>();

        newList.add(newItem);

        Menu newMenu = new Menu(newList);

        newMenu.addItem(newItem2);

        // newMenu.removeItem(newItem);

        newMenu.printMenu();

    }

}
