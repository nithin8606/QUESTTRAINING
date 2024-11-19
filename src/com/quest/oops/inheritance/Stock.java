package com.quest.oops.inheritance;

public abstract class Stock {
    protected String stockName;
    protected String stockSymbol;
    protected int[] prices;
    public Stock(String stockName, String stockSymbol, int[] prices) {
        this.stockName = stockName;
        this.stockSymbol = stockSymbol;
        this.prices = prices;
    }
    public abstract int findHighPrice();
    public abstract int findLowPrice();
    public abstract double AveragePrice();
    public abstract int[] IncreasingTrend();
    public abstract void displayAnalysis();
}

