package com.quest.casestudy.casestudy22;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Customer implements Serializable {
    private String customerId;
    private String name;
    private String email;
    private List<Vehicle> purchasedVehicles;
    private List<LocalDateTime> purchaseDateTimes;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.purchasedVehicles = new ArrayList<>();
        this.purchaseDateTimes = new ArrayList<>();
    }

    public void addPurchasedVehicle(Vehicle vehicle) {
        purchasedVehicles.add(vehicle);
        purchaseDateTimes.add(LocalDateTime.now());  // Capture purchase date and time
    }

    public List<Vehicle> getPurchasedVehicles() {
        return purchasedVehicles;
    }

    public List<LocalDateTime> getPurchaseDateTimes() {
        return purchaseDateTimes;
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer ID: ").append(customerId)
                .append(", Name: ").append(name)
                .append(", Email: ").append(email)
                .append(", Purchased Vehicles: ");
        for (int i = 0; i < purchasedVehicles.size(); i++) {
            sb.append("\n  ").append(purchasedVehicles.get(i).toString()).append(" | Purchase Date: ").append(purchaseDateTimes.get(i));
        }
        return sb.toString();
    }
}
