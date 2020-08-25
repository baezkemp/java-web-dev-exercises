package org.launchcode.java.studios.RestaurantMenu;

public class MenuItems {

    private String name;
    private String description;
    private String category;
    private double price;
    private boolean newItem;

    public MenuItems (String name, String description, String category, double price, boolean newItem){
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.newItem = newItem;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean getNewItem() {
        return newItem;
    }

}