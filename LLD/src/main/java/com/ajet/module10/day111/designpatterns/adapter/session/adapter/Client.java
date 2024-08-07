package com.ajet.module10.day111.designpatterns.adapter.session.adapter;

import com.ajet.module10.day111.designpatterns.adapter.session.adapter.icicibank.ICICIBankAdapter;
import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.PhonePe;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe("1234567890", new ICICIBankAdapter());
        phonePe.checkLoan("1234567890", new ICICIBankAdapter());
    }
}
