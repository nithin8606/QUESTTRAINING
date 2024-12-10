package com.quest.casestudy.casestudy25;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting the Vehicle Management System");
        VehicleManagementSystem vehicleManagementSystem = new VehicleManagementSystem();
        vehicleManagementSystem.manageVehicles();


        System.out.println("Initializing the Service Management System");
        ServiceManagementSystem serviceManagementSystem = new ServiceManagementSystem();

        Vehicle ev = new ElectricVehicle("EV001", "Tesla", "Model S", 2020, 30000, "John Doe", 85, 600);
        Customer customer1 = new Customer("C001", "John Doe", "johndoe@example.com", ev);
        System.out.println("Customer Created: " + customer1);


        ServiceBooking booking1 = new ServiceBooking("B001", customer1, LocalDateTime.now().plusDays(5), "Battery Check", 150);
        ServiceBooking booking2 = new ServiceBooking("B002", customer1, LocalDateTime.now().plusDays(3), "Oil Change", 120);

        try {
            System.out.println("\nAdding Service Bookings");
            serviceManagementSystem.addServiceBooking(booking1);
            serviceManagementSystem.addServiceBooking(booking2);
            System.out.println("Service bookings added successfully!");
        } catch (InvalidBookingException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Serializing Service Data
        System.out.println("\nSerializing Service Data");
        serviceManagementSystem.serializeServiceData();

        // Deserializing Service Data
        System.out.println("\nDeserializing Service Data");
        serviceManagementSystem.deserializeServiceData();

        // Generating Service Reports
        System.out.println("\nGenerating Service Reports");
        serviceManagementSystem.generateServiceReports();

        // Reading Service Reports
        System.out.println("\nReading Service Reports");
        serviceManagementSystem.readServiceReport();

        // Generating Advanced Reports
        System.out.println("\nGenerating Advanced Reports");
        serviceManagementSystem.generateAdvancedReports();

        // Creating a Discounted Service Booking
        System.out.println("\nCreating a Discounted Service Booking");
        ServiceBooking discountedBooking = serviceManagementSystem.createDiscountedBooking(booking1);
        System.out.println("Discounted Booking: " + discountedBooking);
    }
}
