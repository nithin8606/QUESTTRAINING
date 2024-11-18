package com.quest.oops.inheritance;

public abstract class StockAnalyzer {
    protected String stockName;
    protected String stockSymbol;
    protected int[] prices;

    public StockAnalyzer(String stockName, String stockSymbol, int[] prices) {
        this.stockName = stockName;
        this.stockSymbol = stockSymbol;
        this.prices = prices;
    }

    public abstract int findHIGHPrice();
    public abstract int findLOWPrice();
    public abstract double calculateAveragePrice();
    public abstract int[] findLongestIncreasingTrend();
    public abstract void displayAnalysis();
}

