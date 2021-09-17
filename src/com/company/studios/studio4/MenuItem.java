package com.company.studios.studio4;


import java.util.Objects;

public class MenuItem {
    // fields towards top
    private Double price;
    private String description;
    private String category;
    private boolean neu;
    private String name;


    //MenuItem newItem = new MenuItem("French Fries", 4.50, "Curley fries", "appetizer", false);
    //MenuItem newItem2 = new MenuItem("Steak", 12.50, "Rib-eye", "main");
    // Constructor(s)
    public MenuItem(String name, Double price, String description, String category, boolean neu){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.neu = neu;
    }

    public MenuItem(String name, Double price, String description, String category) {
        this(name, price, description, category, true);
    }

    public MenuItem() {}

    // could add conditional later (if new return this; else return this....)
    public boolean isNew() {
        return neu;
    }

    //overrides


    @Override
    public String toString() {
        String listing = "menu item: " + this.name + "    price: " + this.price;
        String newOrNot = "";
        if(neu) {
            newOrNot = "      new!!!";
        }

            return listing.concat(newOrNot);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // Getters and Setters
    public Double getPrice() {
        return this.price;
    }
    public void setPrice(Double aPrice) {
        this.price = aPrice;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String aDescription){
        this.description = aDescription;
    }

    public boolean getNeu() {
        return this.neu;
    }
    public void setNeu(boolean aIsNew) {
        this.neu = aIsNew;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
