package com.quest.thread.synchronization;

public class POSSystem {
    private Inventory inventory;

    public POSSystem() {
        inventory = new Inventory();
    }

    public void addVehicles() {
        inventory.addVehicle(new Vehicle("V001", "Toyota", "Corolla", 25000, 5));
        inventory.addVehicle(new Vehicle("V002", "Honda", "Civic", 22000, 3));
        inventory.addVehicle(new Vehicle("V003", "Ford", "Focus", 20000, 4));
    }

    private boolean isVehicleAvailableForSale(String vehicleId, int quantity) {
        Vehicle vehicle = inventory.getVehicle(vehicleId);
        return vehicle != null && vehicle.getQuantity() >= quantity;
    }

    private void processSale(String vehicleId, int quantity, String customerName, String customerContact) {
        Vehicle vehicle = inventory.getVehicle(vehicleId);
        if (vehicle != null && inventory.sellVehicle(vehicleId, quantity)) {
            Sale sale = new Sale(customerName, customerContact, vehicle, quantity);
            sale.generateReceipt();
            System.out.println("Sale completed. Total: $" + sale.getTotalAmount());
        } else {
            System.out.println("Error: Insufficient stock.");
        }
    }


    public void sellVehicle(String vehicleId, int quantity, String customerName, String customerContact) {
        if (isVehicleAvailableForSale(vehicleId, quantity)) {
            processSale(vehicleId, quantity, customerName, customerContact);
        } else {
            System.out.println("Error: Vehicle not found or insufficient stock.");
        }
    }

    public void generateStockReport() {
        inventory.displayStock();
    }

    public static void main(String[] args) {
        POSSystem posSystem = new POSSystem();
        posSystem.addVehicles();

        posSystem.generateStockReport();

        posSystem.sellVehicle("V001", 2, "John Doe", "555-1234");
        posSystem.sellVehicle("V003", 1, "Jane Smith", "555-5678");

        posSystem.generateStockReport();
    }
}