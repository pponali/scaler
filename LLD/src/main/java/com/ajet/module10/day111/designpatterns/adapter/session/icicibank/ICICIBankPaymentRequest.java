package com.ajet.module10.day111.designpatterns.adapter.session.icicibank;

public class ICICIBankPaymentRequest {
    private String accountNumber;
    private String ifscCode;
    private double amount;
    private String paymentMode;

    public ICICIBankPaymentRequest(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }
}
