package com.quest.casestudy.casestudy25;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class VehicleManagementSystem {

    private List<Vehicle> vehicles = new ArrayList<>();
    private ServiceCenter<ElectricVehicle> electricServiceCenter = new ServiceCenter<>();
    private ServiceCenter<CombustionEngineVehicle> combustionServiceCenter = new ServiceCenter<>();

    public void manageVehicles() {

        ElectricVehicle ev1 = new ElectricVehicle("EV001", "Tesla", "Model S", 2020, 30000, "John Doe", 85, 600);
        CombustionEngineVehicle cev1 = new CombustionEngineVehicle("CEV001", "BMW", "X5", 2014, 60000, "Alice", "Petrol", 3.0);

        electricServiceCenter.addServicedVehicle(ev1);
        combustionServiceCenter.addServicedVehicle(cev1);


        Predicate<Vehicle> mileageFilter = vehicle -> vehicle.getMileage() > 50000;
        Predicate<Vehicle> yearFilter = vehicle -> vehicle.getYear() < 2015;

        Consumer<Vehicle> vehiclePrinter = vehicle -> System.out.println("VIN: " + vehicle.getVin() + ", Mileage: " + vehicle.getMileage());

        Function<Vehicle, Double> resaleValueCalculator = vehicle -> {
            double originalPrice = 50000;
            double depreciationRate = 0.15;
            int yearsUsed = 2024 - vehicle.getYear();
            return originalPrice - (depreciationRate * yearsUsed * originalPrice);
        };

        vehicles.add(ev1);
        vehicles.add(cev1);

        System.out.println("Serviced Electric Vehicles:");
        for (ElectricVehicle ev : electricServiceCenter.getAllServicedVehicles()) {
            System.out.println(ev);
        }

        System.out.println("\nServiced Combustion Engine Vehicles:");
        for (CombustionEngineVehicle cev : combustionServiceCenter.getAllServicedVehicles()) {
            System.out.println(cev);
        }

        // Mileage greater than 50,000 km
        System.out.println("\nVehicles with mileage greater than 50,000 km:");
        vehicles.stream().filter(mileageFilter).forEach(vehiclePrinter);

        // Vehicles manufactured before 2015
        System.out.println("\nVehicles manufactured before 2015:");
        vehicles.stream().filter(yearFilter).forEach(vehiclePrinter);

        //Resale values for all vehicles
        System.out.println("\nResale values for vehicles:");
        vehicles.stream().map(resaleValueCalculator).forEach(resaleValue -> System.out.println("Resale Value: " + resaleValue));

        Supplier<ElectricVehicle> electricVehicleSupplier = () -> new ElectricVehicle("EV" + new Random().nextInt(100), "Nissan", "Leaf", 2021, 15000, "Sam", 40, 450);
        Supplier<CombustionEngineVehicle> combustionVehicleSupplier = () -> new CombustionEngineVehicle("CEV" + new Random().nextInt(100), "Audi", "A4", 2019, 40000, "Emma", "Diesel", 2.0);

        ElectricVehicle randomEV = electricVehicleSupplier.get();
        CombustionEngineVehicle randomCEV = combustionVehicleSupplier.get();
        System.out.println("\nRandom Electric Vehicle: " + randomEV);
        System.out.println("Random Combustion Engine Vehicle: " + randomCEV);

        // Oldest vehicle
        Optional<Vehicle> oldestVehicle = vehicles.stream().min(Comparator.comparingInt(Vehicle::getYear));
        System.out.println("\nOldest Vehicle:");
        oldestVehicle.ifPresent(System.out::println);

        System.out.println("\nCount of Vehicles by Type:");
        Map<String, Long> vehicleTypeCount = vehicles.stream()
                .collect(Collectors.groupingBy(vehicle -> vehicle instanceof ElectricVehicle ? "Electric" : "Combustion", Collectors.counting()));
        vehicleTypeCount.forEach((type, count) -> System.out.println(type + ": " + count));
    }



    }

