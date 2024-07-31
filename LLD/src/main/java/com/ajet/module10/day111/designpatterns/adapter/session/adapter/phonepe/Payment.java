package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe;

import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.response.PhonePePaymentPayResponse;

public class Payment {

    public PhonePePaymentPayResponse makePayment(String fromAccount, String toAccount, double amount, YesbankAPI yesbankAPI) {
        yesbankAPI.pay(fromAccount, amount);
        yesbankAPI.receive(toAccount, amount);
        return new PhonePePaymentPayResponse("Payment successful", "200");
    }


}
