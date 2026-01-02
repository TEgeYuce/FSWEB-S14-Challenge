package org.example.models;

public class HealthyBurger extends Hamburger {

    private double healthyExtra1Price;
    private String healthyExtra1Name;
    private double healthyExtra2Price;
    private String healthyExtra2Name;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name,"Tofu",price,breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            System.out.println("HealthyAddition1: " + this.healthyExtra1Name);
            totalPrice += this.healthyExtra1Price;
        }

        if (this.healthyExtra2Name != null) {
            System.out.println("HealthyAddition2: " + this.healthyExtra2Name);
            totalPrice += this.healthyExtra2Price;
        }

        if (this.healthyExtra1Name != null || this.healthyExtra2Name != null) {
            System.out.println("Price: " + totalPrice);
        }

        return totalPrice;


    }


    @Override
    public double getPrice() {
        double totalPrice = super.getPrice();
        if (this.healthyExtra1Name != null) {
            totalPrice += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            totalPrice += this.healthyExtra2Price;
        }

        return totalPrice;


    }


}

