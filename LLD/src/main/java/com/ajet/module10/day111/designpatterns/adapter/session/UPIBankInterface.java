package com.ajet.module10.day111.designpatterns.adapter.session;

public interface UPIBankInterface {
    public void pay(String accountNumber, double amount);
    public void receive(String accountNumber, double amount);

}
