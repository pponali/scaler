package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.paymentadapter;


import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.request.PhonePePaymentPayRequest;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.request.PhonePePaymentReceiveRequest;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.response.PhonePePaymentPayResponse;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.response.PhonePePaymentReceiveResponse;

public interface UPIInterface {
    int getBalance(String accountNumber);
    PhonePePaymentPayResponse pay(PhonePePaymentPayRequest request);
    PhonePePaymentReceiveResponse receive(PhonePePaymentReceiveRequest request);
}
