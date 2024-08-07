package com.ajet.module10.day111.designpatterns.adapter.session.icicibank;

public class ICICIBankAPI {

    public int amount;

    public int fetchBalance(String amount) {
        System.out.println("Fetching balance from ICICI Bank");
        return 0;
    }

    public void setTransferringAmount(int amount) {
        this.amount = amount;
    }

    public ICICIBankPaymentResponse sendManey(ICICIBankPaymentRequest request) {
        System.out.println("Setting money in ICICI Bank");
        return new  ICICIBankPaymentResponse("Money set successfully", "0", true);
    }



}
