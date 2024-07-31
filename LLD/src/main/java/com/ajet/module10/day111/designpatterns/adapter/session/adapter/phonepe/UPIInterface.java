package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe;

public interface UPIInterface {
    int getBalance(String accountNumber);
    PhonePePaymentPayResponse pay(PhonePePaymentPayRequest request);
    PhonePePaymentReceiveResponse receive(PhonePePaymentReceiveRequest request);
}
