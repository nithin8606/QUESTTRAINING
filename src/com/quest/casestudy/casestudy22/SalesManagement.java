package com.quest.casestudy.casestudy22;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

class VehicleNotFoundException extends Exception {
    public VehicleNotFoundException(String message) {
        super(message);
    }
}

public class SalesManagement {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> inventory = new ArrayList<>(Arrays.asList(
                new Car("C001", "Toyota", "Corolla", 20000, LocalDate.of(2020, 5, 15), 5),
                new Car("C002", "Honda", "Civic", 22000, LocalDate.of(2021, 3, 10), 5),
                new Bike("B001", "Yamaha", "R15", 1500, LocalDate.of(2021, 6, 18), 150),
                new Bike("B002", "Suzuki", "Hayabusa", 18000, LocalDate.of(2022, 9, 12), 1340)
        ));


        Map<Customer, Set<Vehicle>> customerPurchases = new HashMap<>();

        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Purchase Vehicle");
            System.out.println("3. Serialize Data");
            System.out.println("4. Deserialize Data");
            System.out.println("5. View All Purchases");
            System.out.println("6. View Vehicles with Discounted Price");
            System.out.println("7. Exit");
            System.out.println("Enter your option :");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Customer Email: ");
                    String email = scanner.nextLine();
                    Customer customer = new Customer(customerId, name, email);
                    customerPurchases.putIfAbsent(customer, new HashSet<>());
                    System.out.println("Customer added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Customer ID: ");
                    String custId = scanner.nextLine();
                    System.out.print("Enter Vehicle ID to purchase: ");
                    String vehicleId = scanner.nextLine();
                    try {
                        Customer existingCustomer = customerPurchases.keySet().stream()
                                .filter(c -> c.getCustomerId().equals(custId))
                                .findFirst().orElseThrow(() -> new VehicleNotFoundException("Customer not found!"));

                        Vehicle vehicle = inventory.stream()
                                .filter(v -> v.getVehicleId().equals(vehicleId))
                                .findFirst().orElseThrow(() -> new VehicleNotFoundException("Vehicle not found!"));

                        existingCustomer.addPurchasedVehicle(vehicle);
                        inventory.remove(vehicle);
                        System.out.println("Vehicle purchased successfully!");

                    } catch (VehicleNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    serializeData(customerPurchases);
                    System.out.println("Data serialized successfully!");
                    break;

                case 4:
                    deserializeData();
                    break;

                case 5:
                    customerPurchases.forEach((customerKey, vehicles) -> {
                        System.out.println("Customer: " + customerKey);
                        vehicles.forEach(vehicle -> System.out.println(vehicle));
                    });
                    break;

                case 6:
                    for (Vehicle vehicle : inventory) {
                        Vehicle discountedVehicle = vehicle.clone();
                        System.out.println("Original Vehicle: " + vehicle);
                        System.out.println("Discounted Vehicle: " + discountedVehicle);
                    }
                    break;


                case 7:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    public static void serializeData(Map<Customer, Set<Vehicle>> customerPurchases) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("salesData.ser"))) {
            out.writeObject(customerPurchases);
        }
    }

    public static void deserializeData() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("salesData.ser"))) {
            Map<Customer, Set<Vehicle>> deserializedData = (Map<Customer, Set<Vehicle>>) in.readObject();
            deserializedData.forEach((customer, vehicles) -> {
                System.out.println("Customer: " + customer);
                vehicles.forEach(vehicle -> System.out.println(vehicle));
            });
        }
    }
}
