package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.paymentadapter;

public class ICICIBankAdapter implements UPIPaymentAdapter {

    ICICIBank api = new ICICIBank();

    @Override
    public void pay(String amount) {
        api.pay(amount);
    }

    @Override
    public void receive(String amount) {
        api.receive(amount);
    }
}
