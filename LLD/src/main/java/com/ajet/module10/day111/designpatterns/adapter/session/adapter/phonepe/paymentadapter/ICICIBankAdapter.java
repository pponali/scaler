package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.paymentadapter;

import com.ajet.module10.day111.designpatterns.adapter.session.icicibank.ICICIBankAPI;

public class ICICIBankAdapter {//implements UPIPaymentAdapter {

    ICICIBankAPI api = new ICICIBankAPI();

    /*@Override
    public void pay(String amount) {
        api.pay(amount);
    }

    @Override
    public void receive(String amount) {
        api.receive(amount);
    }*/
}
