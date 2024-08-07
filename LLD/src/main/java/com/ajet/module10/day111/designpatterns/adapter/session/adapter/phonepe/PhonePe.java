package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe;

import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.paymentadapter.UPIInterface;
import com.ajet.module10.day111.designpatterns.adapter.session.phonepe.Payment;
import com.ajet.module10.day111.designpatterns.adapter.session.phonepe.PhonePeLoan;

public class PhonePe {
    String account;
    UPIInterface api;
    PhonePeLoan phonePeLoan = new PhonePeLoan();
    Payment payment = new Payment();

    public PhonePe(String account, UPIInterface api) {
        this.account = account;
        this.api = api;
    }

    public boolean checkLoan(String account, UPIInterface api) {
        return phonePeLoan.checkLoan(account, api);
    }
}
