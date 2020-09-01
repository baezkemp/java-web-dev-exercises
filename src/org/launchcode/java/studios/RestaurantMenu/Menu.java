package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItems> MyMenu;
    private Date dateUpdated;

    public Menu(Date dateUpdate, ArrayList<MenuItems> item){
        this.dateUpdated = dateUpdate;
        this.MyMenu = item;
    }

    public void addItem(MenuItems item){
        if(!MyMenu.contains(item)) {
            MyMenu.add(item);
            this.dateUpdated = new Date();
        } else {
            System.out.println("Alert: " + item + " is already on the menu.");
        }
    }

    public void removeItem(MenuItems item){
        MyMenu.remove(item);
    }
    public Date getLastUpdated(){
        return dateUpdated;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + MyMenu +
                ", dateUpdated=" + dateUpdated +
                '}';
    }
}
