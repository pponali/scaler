package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.stockobserver.services;

import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.stockobserver.Observer;
import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.stockobserver.utils.NotificationUtils;

public class EmailService implements Observer {
    public void sendEmail(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendEmail(subject, message);
    }

    @Override
    public void updateStockPrice(String stockName, double currentPrice) {
        sendEmail(stockName, currentPrice);
    }
}