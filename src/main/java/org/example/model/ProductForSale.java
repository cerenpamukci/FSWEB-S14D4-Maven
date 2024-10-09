package org.example.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    // Constructor
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    // Getter metotları
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }


    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    // Abstract metot
    public abstract void showDetails();
}
