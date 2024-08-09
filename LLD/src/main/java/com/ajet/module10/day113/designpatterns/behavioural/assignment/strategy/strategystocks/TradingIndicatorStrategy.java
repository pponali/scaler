package com.ajet.module10.day113.designpatterns.behavioural.assignment.strategy.strategystocks;


public interface TradingIndicatorStrategy {
    TradingStrategyType supportsType();
    Double calculateIndicator(Stock stock);
}
