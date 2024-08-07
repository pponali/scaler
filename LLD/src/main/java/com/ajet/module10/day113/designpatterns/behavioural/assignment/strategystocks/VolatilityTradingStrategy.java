package com.ajet.module10.day113.designpatterns.behavioural.assignment.strategystocks;

public class VolatilityTradingStrategy implements TradingIndicatorStrategy{

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.VOLATILITY;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }

}