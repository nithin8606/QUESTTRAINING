package com.quest.casestudy.casestudy25;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {
    protected String vin;
    protected String brand;
    protected String model;
    protected int year;
    protected double mileage;
    protected String ownerName;

    public Vehicle(String vin, String brand, String model, int year, double mileage, String ownerName) {
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.ownerName = ownerName;
    }

    public String getVin() {
        return vin;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "VIN: " + vin + ", Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Mileage: " + mileage + " km, Owner: " + ownerName;
    }
}

