package org.example.models;

public class DeluxeBurger extends Hamburger {

    private String drink;
    private String cips;

    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.10, "Double Sandwich");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return this.cips;
    }

    public String getDrink() {
        return this.drink;
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }


}

