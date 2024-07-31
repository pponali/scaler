package com.ajet.module10.day111.designpatterns.adapter.session.adapter.icicibank;

public class ICICIBankPaymentRequest {
    private String accountNumber;
    private String ifscCode;
    private String amount;
    private String paymentMode;

    public ICICIBankPaymentRequest(String accountNumber, String ifscCode, String amount, String paymentMode) {
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.amount = amount;
        this.paymentMode = paymentMode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getAmount() {
        return amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }
}
