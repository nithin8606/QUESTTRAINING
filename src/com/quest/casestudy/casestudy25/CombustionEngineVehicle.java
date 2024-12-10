package com.quest.casestudy.casestudy25;

// CombustionEngineVehicle.java
public class CombustionEngineVehicle extends Vehicle {
    private String fuelType;
    private double engineCapacity;

    public CombustionEngineVehicle(String vin, String brand, String model, int year, double mileage, String ownerName, String fuelType, double engineCapacity) {
        super(vin, brand, model, year, mileage, ownerName);
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fuel Type: " + fuelType + ", Engine Capacity: " + engineCapacity + " L";
    }
}
