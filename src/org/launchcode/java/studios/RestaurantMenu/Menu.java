package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItems> foodStuff;
    private Date dateUpdated;

    public Menu(Date dateUpdate){
        this.dateUpdated = dateUpdate;
        this.foodStuff = new ArrayList<>();
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public static void main(String[] args) {
        MenuItems bakedPotato = new MenuItems("Baked Potato", "Not a raw potato", "Appetizer", 5.99, true);
        MenuItems chickenNoodleSoup = new MenuItems("Chicken Soup", "Noodle Soup", "Appetizer", 5.99, false);

        System.out.println(bakedPotato.getNewItem());
    }

}
