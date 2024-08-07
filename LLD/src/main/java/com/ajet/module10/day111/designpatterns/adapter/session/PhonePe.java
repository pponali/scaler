package com.ajet.module10.day111.designpatterns.adapter.session;

import com.ajet.module10.day111.designpatterns.adapter.session.yesbank.YesBank;

public class PhonePe {

    public static void main(String[] args) {
        UPIBankInterface bank = new YesBank();
        bank.pay("1234567890", 1000);
        bank.receive("1234567890", 1000);
    }
}
