package com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.stockobserver.services;

import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.stockobserver.Observer;
import com.ajet.module10.day113.designpatterns.behavioural.assignment.observer.stockobserver.utils.NotificationUtils;

public class SmsService implements Observer {
    public void sendSMS(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendSms(subject, message);
    }

    @Override
    public void updateStockPrice(String stockName, double currentPrice) {
        sendSMS(stockName, currentPrice);
    }
}