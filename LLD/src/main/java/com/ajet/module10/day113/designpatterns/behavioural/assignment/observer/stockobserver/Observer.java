package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.stockobserver;

public interface Observer {
    void updateStockPrice(String stockName, double currentPrice);
}
