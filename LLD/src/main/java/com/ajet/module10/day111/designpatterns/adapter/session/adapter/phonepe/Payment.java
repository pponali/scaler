package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe;

import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.paymentadapter.UPIInterface;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.request.PhonePePaymentPayRequest;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.response.PhonePePaymentPayResponse;


public class Payment {

    public boolean makePayment(String fromAccount, String toAccount, double amount, UPIInterface api) {
        PhonePePaymentPayRequest request = new PhonePePaymentPayRequest(fromAccount, toAccount, amount);
        PhonePePaymentPayResponse response = api.pay(request);
        return response.isPaymentSuccess();
    }


}
