package com.ajet.module10.day111.designpatterns.adapter.session;

public class ICICIBank implements UPIBankInterface {
    @Override
    public void pay(String accountNumber, double amount) {
        System.out.println("Paying " + amount + " to " + accountNumber + " from ICICI Bank");
    }

    @Override
    public void receive(String accountNumber, double amount) {
        System.out.println("Receiving " + amount + " from " + accountNumber + " to ICICI Bank");
    }
}
