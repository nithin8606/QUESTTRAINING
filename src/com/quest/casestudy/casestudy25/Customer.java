package com.quest.casestudy.casestudy25;

import java.io.Serializable;

public class Customer implements Serializable {
    private String customerId;
    private String name;
    private String email;
    private Vehicle vehicle;

    public Customer(String customerId, String name, String email, Vehicle vehicle) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.vehicle = vehicle;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Email: " + email + ", Vehicle: " + vehicle.toString();
    }
}

