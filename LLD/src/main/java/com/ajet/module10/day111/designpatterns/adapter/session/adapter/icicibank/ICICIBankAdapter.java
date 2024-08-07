package com.ajet.module10.day111.designpatterns.adapter.session.adapter.icicibank;

import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.paymentadapter.UPIInterface;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.request.PhonePePaymentPayRequest;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.request.PhonePePaymentReceiveRequest;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.response.PhonePePaymentPayResponse;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.response.PhonePePaymentReceiveResponse;
import com.ajet.module10.day111.designpatterns.adapter.session.icicibank.ICICIBankAPI;
import com.ajet.module10.day111.designpatterns.adapter.session.icicibank.ICICIBankPaymentRequest;
import com.ajet.module10.day111.designpatterns.adapter.session.icicibank.ICICIBankPaymentResponse;

public class ICICIBankAdapter implements UPIInterface {
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public int getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public PhonePePaymentPayResponse pay(PhonePePaymentPayRequest request) {
        ICICIBankPaymentRequest iciciBankPaymentRequest = new ICICIBankPaymentRequest(request.getFromAccount(), request.getAmount());
        // Logic to pay using ICICI Bank
        ICICIBankPaymentResponse response = iciciBankAPI.sendManey(iciciBankPaymentRequest);
        // return response.
        return new PhonePePaymentPayResponse(response.isStatus(), "ICICI Bank Transaction ID");
        }

    @Override
    public PhonePePaymentReceiveResponse receive(PhonePePaymentReceiveRequest request) {
        return null;
    }
}
