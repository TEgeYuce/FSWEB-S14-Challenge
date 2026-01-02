package org.example.models;

public class Hamburger {
    private String meat;
    private String name;
    private String breadRollType;
    private double price;

    private double addition1Price;
    private String addition1Name;
    private double addition2Price;
    private String addition2Name;
    private double addition3Price;
    private String addition3Name;
    private double addition4Price;
    private String addition4Name;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {

        System.out.println("Name: " + this.name);
        System.out.println("Meat: " + this.meat);
        System.out.println("BreadRollType: " + this.breadRollType);

        if (this.addition1Name != null) {
            System.out.println("Addition1: " + this.addition1Name);
        }

        if (this.addition2Name != null) {
            System.out.println("Addition2: " + this.addition2Name);
        }

        if (this.addition3Name != null) {
            System.out.println("Addition3: " + this.addition3Name);
        }

        if (this.addition4Name != null) {
            System.out.println("Addition4: " + this.addition4Name);
        }

        double totalPrice = getPrice();
        System.out.println("Price: " + totalPrice);
        return totalPrice;


    }

    public String getName() {
        return this.name;
    }

    public String getMeat() {
        return this.meat;
    }

    public double getPrice() {
        double totalPrice = this.price;
        if (this.addition1Name != null) {
            totalPrice += this.addition1Price;
        }
        if (this.addition2Name != null) {
            totalPrice += this.addition2Price;
        }
        if (this.addition3Name != null) {
            totalPrice += this.addition3Price;
        }
        if (this.addition4Name != null) {
            totalPrice += this.addition4Price;
        }

        return totalPrice;


    }

    public String getBreadRollType() {
        return this.breadRollType;
    }


}

