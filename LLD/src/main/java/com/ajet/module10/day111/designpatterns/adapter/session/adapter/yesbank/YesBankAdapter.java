package com.ajet.module10.day111.designpatterns.adapter.session.adapter.yesbank;

import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.paymentadapter.UPIInterface;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.request.PhonePePaymentPayRequest;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.request.PhonePePaymentReceiveRequest;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.response.PhonePePaymentPayResponse;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.response.PhonePePaymentReceiveResponse;
import com.ajet.module10.day111.designpatterns.adapter.session.yesbank.YesBankAPI;
import com.ajet.module10.day111.designpatterns.adapter.session.yesbank.YesBankPaymentRequest;
import com.ajet.module10.day111.designpatterns.adapter.session.yesbank.YesBankPaymentResponse;

public class YesBankAdapter implements UPIInterface {

    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public PhonePePaymentPayResponse pay(PhonePePaymentPayRequest request) {
        YesBankPaymentRequest yesBankPaymentRequest = new YesBankPaymentRequest(request.getAmount(), request.getFromAccount(), request.getToAccount());
        // Logic to pay using YesBank
        YesBankPaymentResponse response = yesBankAPI.transferMoney(yesBankPaymentRequest);
        // return response.
        return new PhonePePaymentPayResponse(response.isTransactionStatus(), response.getTransactionId());
    }

    @Override
    public PhonePePaymentReceiveResponse receive(PhonePePaymentReceiveRequest request) {
        return null;
    }
}
