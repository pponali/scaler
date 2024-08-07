package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.paymentadapter;

public interface UPIPaymentAdapter {
    void pay(String amount);

    void receive(String amount);
}
