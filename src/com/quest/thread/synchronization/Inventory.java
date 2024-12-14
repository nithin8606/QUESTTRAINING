package com.quest.thread.synchronization;

import java.util.*;

public class Inventory {
    private Map<String, Vehicle> vehicles;

    public Inventory() {
        vehicles = new HashMap<>();
    }

    // Add a new vehicle to the inventory
    public void addVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getId(), vehicle);
        System.out.println("Vehicle added: " + vehicle);
    }

    // Sell a vehicle (reduce quantity in stock)
    public boolean sellVehicle(String vehicleId, int quantity) {
        Vehicle vehicle = vehicles.get(vehicleId);
        if (vehicle == null || vehicle.getQuantity() < quantity) {
            System.out.println("Error: Vehicle out of stock or invalid ID.");
            return false;
        }
        vehicle.setQuantity(vehicle.getQuantity() - quantity);
        System.out.println(quantity + " " + vehicle.getMake() + " " + vehicle.getModel() + " sold.");
        return true;
    }

    // Display all vehicles in stock
    public void displayStock() {
        System.out.println("Vehicles in Stock:");
        for (Vehicle vehicle : vehicles.values()) {
            System.out.println(vehicle);
        }
    }

    // Get a vehicle by ID
    public Vehicle getVehicle(String id) {
        return vehicles.get(id);
    }
}
