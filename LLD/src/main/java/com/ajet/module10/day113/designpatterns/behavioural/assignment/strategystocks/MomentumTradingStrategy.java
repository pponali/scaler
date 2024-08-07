package com.ajet.module10.day113.designpatterns.behavioural.assignment.strategystocks;

public class MomentumTradingStrategy implements TradingIndicatorStrategy{

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOMENTUM;

    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return stock.getPrice() - stock.getPreviousPrice();
    }

}