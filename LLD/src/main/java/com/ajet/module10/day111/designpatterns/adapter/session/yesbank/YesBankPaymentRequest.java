package com.ajet.module10.day111.designpatterns.adapter.session.yesbank;


public class YesBankPaymentRequest {

    private double amount;
    private String fromAccountNumber;
    private String toAccountNumber;

    public YesBankPaymentRequest(double amount, String fromAccountNumber, String toAccountNumber) {
        this.amount = amount;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }

    @Override
    public String toString() {
        return "YesBankPaymentRequest{" +
                "amount='" + amount + '\'' +
                ", fromAccountNumber='" + fromAccountNumber + '\'' +
                ", toAccountNumber='" + toAccountNumber + '\'' +
                '}';
    }
}
