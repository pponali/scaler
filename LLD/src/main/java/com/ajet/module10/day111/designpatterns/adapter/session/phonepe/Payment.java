package com.ajet.module10.day111.designpatterns.adapter.session.phonepe;

public class Payment {

    makePayment(String fromAccount, String toAccount, double amount, YesbankAPI yesbankAPI) {
        yesbankAPI.pay(fromAccount, amount);
        yesbankAPI.receive(toAccount, amount);
    }
}
