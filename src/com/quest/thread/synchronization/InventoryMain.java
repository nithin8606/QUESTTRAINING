package com.quest.thread.synchronization;// Main.java
import java.util.*;

public class InventoryMain {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1000.0, 20),
                new Product("Mouse", 50.0, 100),
                new Product("Keyboard", 70.0, 50),
                new Product("Monitor", 300.0, 10)
        );

        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        System.out.println("Total inventory value: " + totalValue);


        products.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        System.out.println("Top 3 most expensive products:");
        for (int i = 0; i < Math.min(3, products.size()); i++) {
            System.out.println(products.get(i).getName());
        }


        Map<String, Double> productMap = new HashMap<>();
        for (Product product : products) {
            productMap.put(product.getName(), product.getPrice());
        }
        System.out.println("Product map: " + productMap);
    }
}
