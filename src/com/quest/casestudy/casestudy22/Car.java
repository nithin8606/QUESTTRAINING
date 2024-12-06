package com.quest.casestudy.casestudy22;

import java.time.LocalDate;

public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String vehicleId, String brand, String model, double price, LocalDate manufactureDate, int seatingCapacity) {
        super(vehicleId, brand, model, price, manufactureDate);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return "Car [ID=" + getVehicleId() + ", Brand=" + getBrand() + ", Model=" + getModel() + ", Price=" + getPrice() + ", ManufactureDate=" + getManufactureDate() + ", SeatingCapacity=" + seatingCapacity + "]";
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }
}

