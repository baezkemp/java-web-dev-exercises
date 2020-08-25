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

    public Date setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public static void main(String[] args) {

    }

}
