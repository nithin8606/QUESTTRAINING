package com.quest.oops.inheritance;

public class EquityStockAnalyzer extends StockAnalyzer {
    private String sector;

    public EquityStockAnalyzer(String stockName, String stockSymbol, String sector, int[] prices) {
        super(stockName, stockSymbol, prices);
        this.sector = sector;
    }

    @Override
    public int findHIGHPrice() {
        int maxPrice = prices[0];
        for (int price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    @Override
    public int findLOWPrice() {
        int minPrice = prices[0];
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    @Override
    public double calculateAveragePrice() {
        double sum = 0;
        for (int price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    @Override
    public int[] findLongestIncreasingTrend() {
        int longestStart = 0, longestLength = 0;
        int currentStart = 0, currentLength = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestStart = currentStart;
                }
                currentStart = i;
                currentLength = 1;
            }
        }

        if (currentLength > longestLength) {
            longestLength = currentLength;
            longestStart = currentStart;
        }

        return new int[]{longestStart + 1, longestStart + longestLength, longestLength}; // Start day, end day, length
    }

    @Override
    public void displayAnalysis() {
        System.out.println("Equity Stock: " + stockName + " (" + stockSymbol + ")");
        System.out.println("Sector: " + sector);
        System.out.println("HIGH Price: " + findHIGHPrice());
        System.out.println("LOW Price: " + findLOWPrice());
        System.out.println("Average Price: " + calculateAveragePrice());
        int[] trend = findLongestIncreasingTrend();
        System.out.println("Longest Increasing Trend: Start Day " + trend[0] + ", End Day " + trend[1] + ", Length: " + trend[2] + " days");
    }
}

