package com.quest.oops.inheritance;

import java.util.Scanner;

public class StockAnalysisProgram1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Equity Stock
        System.out.println("Enter details for Equity Stock:");
        System.out.print("Stock Name: ");
        String equityName = scanner.nextLine();
        System.out.print("Stock Symbol: ");
        String equitySymbol = scanner.nextLine();
        System.out.print("Sector: ");
        String sector = scanner.nextLine();
        System.out.print("Number of days: ");
        int days = scanner.nextInt();
        int[] equityPrices = new int[days];
        System.out.println("Enter prices:");
        for (int i = 0; i < days; i++) {
            equityPrices[i] = scanner.nextInt();
        }

        // Equity Stock Analyzer
        StockAnalyzer equityStock = new EquityStockAnalyzer(equityName, equitySymbol, sector, equityPrices);

        // Commodity Stock
        scanner.nextLine(); // Consume the leftover newline
        System.out.println("\nEnter details for Commodity Stock:");
        System.out.print("Stock Name: ");
        String commodityName = scanner.nextLine();
        System.out.print("Stock Symbol: ");
        String commoditySymbol = scanner.nextLine();
        System.out.print("Commodity Type: ");
        String commodityType = scanner.nextLine();
        System.out.print("Number of days: ");
        days = scanner.nextInt();
        int[] commodityPrices = new int[days];
        System.out.println("Enter prices:");
        for (int i = 0; i < days; i++) {
            commodityPrices[i] = scanner.nextInt();
        }

        // Commodity Stock Analyzer
        StockAnalyzer commodityStock = new CommodityStockAnalyzer(commodityName, commoditySymbol, commodityType, commodityPrices);


        System.out.println("\nEquity Stock Analysis:");
        equityStock.displayAnalysis();
        System.out.println("\nCommodity Stock Analysis:");
        commodityStock.displayAnalysis();

        // Compare average prices
        double equityAvg = equityStock.calculateAveragePrice();
        double commodityAvg = commodityStock.calculateAveragePrice();
        System.out.println("\nAverage Price Comparison:");
        if (equityAvg > commodityAvg) {
            System.out.println("Equity Stock has the highest average price.");
        } else if (commodityAvg > equityAvg) {
            System.out.println("Commodity Stock has the highest average price.");
        } else {
            System.out.println("Both stocks have the same average price.");
        }

        // Compare longest increasing trend
        int[] equityTrend = equityStock.findLongestIncreasingTrend();
        int[] commodityTrend = commodityStock.findLongestIncreasingTrend();
        System.out.println("\nLongest Increasing Trend Comparison:");
        if (equityTrend[2] > commodityTrend[2]) {
            System.out.println("Equity Stock has the longest increasing trend.");
        } else if (commodityTrend[2] > equityTrend[2]) {
            System.out.println("Commodity Stock has the longest increasing trend.");
        } else {
            System.out.println("Both stocks have the same longest increasing trend.");
        }
    }
}
