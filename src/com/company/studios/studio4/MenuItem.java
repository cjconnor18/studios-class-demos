package com.company.studios.studio4;


public class MenuItem {
    // fields towards top
    private Double price;
    private String description;
    private String category;
    private boolean isNew;
    private String name;


    //MenuItem newItem = new MenuItem("French Fries", 4.50, "Curley fries", "appetizer", false);
    //MenuItem newItem2 = new MenuItem("Steak", 12.50, "Rib-eye", "main");
    // Constructor(s)
    public MenuItem(String name, Double price, String description, String category, boolean isNew){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public MenuItem(String name, Double price, String description, String category) {
        this(name, price, description, category, true);
    }

    public MenuItem() {}


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

    public boolean getIsNew() {
        return this.isNew;
    }
    public void setIsNew(boolean aIsNew) {
        this.isNew = aIsNew;
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
