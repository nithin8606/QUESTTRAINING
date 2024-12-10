package com.quest.casestudy.casestudy25;
import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class ServiceManagementSystem {

    private Map<Customer, List<ServiceBooking>> bookings = new HashMap<>();

    public void addServiceBooking(ServiceBooking booking) throws InvalidBookingException {

        if (bookings.values().stream().anyMatch(list -> list.stream().anyMatch(b -> b.getBookingId().equals(booking.getBookingId())))) {
            throw new InvalidBookingException("Duplicate Booking ID: " + booking.getBookingId());
        }

        if (booking.getServiceDate().isBefore(LocalDateTime.now())) {
            throw new InvalidBookingException("Service date cannot be in the past: " + booking.getServiceDate());
        }

        bookings.computeIfAbsent(booking.getCustomer(), k -> new ArrayList<>()).add(booking);
    }

    public void serializeServiceData() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serviceData.ser"))) {
            out.writeObject(bookings);
            System.out.println("Service data serialized successfully.");
        } catch (IOException e) {
            System.err.println("Error serializing service data: " + e.getMessage());
        }
    }

    public void deserializeServiceData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("serviceData.ser"))) {
            bookings = (Map<Customer, List<ServiceBooking>>) in.readObject();
            System.out.println("Service data deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error deserializing service data: " + e.getMessage());
        }
    }

    public void generateServiceReports() {
        double totalRevenue = bookings.values().stream()
                .flatMap(List::stream)
                .mapToDouble(ServiceBooking::getCost)
                .sum();

        Map<String, Long> serviceCount = bookings.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(ServiceBooking::getServiceType, Collectors.counting()));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("serviceReports.txt"))) {
            writer.write("Total revenue generated from all services: " + totalRevenue + "\n");
            writer.write("Service count by type:\n");
            serviceCount.forEach((service, count) -> {
                try {
                    writer.write(service + ": " + count + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            System.out.println("Service report generated successfully.");
        } catch (IOException e) {
            System.err.println("Error generating service report: " + e.getMessage());
        }
    }

    public void readServiceReport() {
        try (BufferedReader reader = new BufferedReader(new FileReader("serviceReports.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading service report: " + e.getMessage());
        }
    }

    public void generateAdvancedReports() {
        // Calculate the average cost of services for electric and combustion engine vehicles
        double averageCostEV = bookings.values().stream()
                .flatMap(List::stream)
                .filter(booking -> booking.getCustomer().getVehicle() instanceof ElectricVehicle)
                .mapToDouble(ServiceBooking::getCost)
                .average()
                .orElse(0);

        double averageCostCV = bookings.values().stream()
                .flatMap(List::stream)
                .filter(booking -> booking.getCustomer().getVehicle() instanceof CombustionEngineVehicle)
                .mapToDouble(ServiceBooking::getCost)
                .average()
                .orElse(0);

        System.out.println("Average cost for Electric Vehicles: " + averageCostEV);
        System.out.println("Average cost for Combustion Engine Vehicles: " + averageCostCV);

        Optional<Customer> topCustomer = bookings.entrySet().stream()
                .max(Comparator.comparingDouble(entry -> entry.getValue().stream().mapToDouble(ServiceBooking::getCost).sum()))
                .map(Map.Entry::getKey);

        topCustomer.ifPresent(customer -> {
            double totalSpent = bookings.get(customer).stream().mapToDouble(ServiceBooking::getCost).sum();
            System.out.println("Customer who spent the most: " + customer.getName() + ", Total Spent: " + totalSpent);
        });
    }


    public ServiceBooking createDiscountedBooking(ServiceBooking booking) {
        return booking.clone();
    }
}
