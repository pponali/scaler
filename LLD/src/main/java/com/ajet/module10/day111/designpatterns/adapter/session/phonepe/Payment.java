package com.ajet.module10.day111.designpatterns.adapter.session.phonepe;

import com.ajet.module10.day111.designpatterns.adapter.session.yesbank.YesBankAPI;
import com.ajet.module10.day111.designpatterns.adapter.session.yesbank.YesBankPaymentRequest;
import com.ajet.module10.day111.designpatterns.adapter.session.yesbank.YesBankPaymentResponse;


    public class Payment {

        public boolean makePayment(String fromAccount, String toAccount, double amount, YesBankAPI yesbankAPI) {
            if(yesbankAPI.checkBalance(fromAccount) > amount){
                YesBankPaymentRequest request = new YesBankPaymentRequest(amount, fromAccount, toAccount);
                YesBankPaymentResponse yesBankPaymentResponse = yesbankAPI.transferMoney(request);
                return yesBankPaymentResponse.isTransactionStatus();
            } else
                return false;
        }

}
