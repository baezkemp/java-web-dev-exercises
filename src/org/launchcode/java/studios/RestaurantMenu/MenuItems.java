package org.launchcode.java.studios.RestaurantMenu;

import java.util.Objects;

public class MenuItems {

    private String name;
    private String description;
    private String category;
    private double price;
    private boolean newItem;

    public MenuItems(String name, String description, String category, double price, boolean newItem) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.newItem = newItem;
    }
        public boolean isNewItem() {
            return newItem;
        }

        @Override
        public String toString() {
            return "MenuItems{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", category='" + category + '\'' +
                    ", price=" + price +
                    ", newItem=" + newItem +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MenuItems menuItems = (MenuItems) o;
            return name.equals(menuItems.name) &&
                    description.equals(menuItems.description) &&
                    category.equals(menuItems.category);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, description, category);
        }

}