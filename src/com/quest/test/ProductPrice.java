package com.quest.test;

import java.util.*;

public class ProductPrice {
    public static void main(String[] args) {

        Map<String, Double> products = new HashMap<>();

        products.put("Laptop", 800.0);
        products.put("Smartphone", 500.0);
        products.put("Tablet", 300.0);

        products.put("Smartphone", 450.0);

        double maxPrice = 0;
        String maxPriceProduct = "";

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if (entry.getValue() > maxPrice) {
                maxPrice = entry.getValue();
                maxPriceProduct = entry.getKey();
            }
        }

        System.out.println("Product with highest price: " + maxPriceProduct + " - " + maxPrice);
    }
}

