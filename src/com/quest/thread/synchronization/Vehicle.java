package com.quest.thread.synchronization;

public class Vehicle {
    private String id;
    private String make;
    private String model;
    private double price;
    private int quantity;

    public Vehicle(String id, String make, String model, double price, int quantity) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    public String getId() {
        return id;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString() {
        return "Vehicle{" +
               "id='" + id + '\'' +
               ", make='" + make + '\'' +
               ", model='" + model + '\'' +
               ", price=" + price +
               ", quantity=" + quantity +
               '}';
    }

}

