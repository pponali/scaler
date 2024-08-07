package com.ajet.module10.day111.designpatterns.adapter.session.yesbank;


public class YesBankAPI {
    public int checkBalance(String accountNumber) {
        return 1000;
    }

    public YesBankPaymentResponse transferMoney(YesBankPaymentRequest request) {
        return new YesBankPaymentResponse("Success", "0", "1234", true);
    }



}
