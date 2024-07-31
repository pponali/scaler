package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.request;

public class PhonePePaymentPayRequest {
    private String fromAccount;
    private String toAccount;
    private double amount;

    public PhonePePaymentPayRequest(String fromAccount, String toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
