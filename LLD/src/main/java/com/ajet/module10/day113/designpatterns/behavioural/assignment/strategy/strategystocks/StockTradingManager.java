package com.ajet.module10.day113.designpatterns.behavioural.assignment.strategy.strategystocks;


public class StockTradingManager {

    private TradingIndicatorStrategy strategy;

    public StockTradingManager(TradingIndicatorStrategy strategy) {
        this.strategy = strategy;
    }

    public Double calculateIndicator(Stock stock) {
        return strategy.calculateIndicator(stock);
    }
}
