package com.ajet.module10.day111.designpatterns.adapter.session.phonepe;

import com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.paymentadapter.UPIInterface;
import com.ajet.module10.day111.designpatterns.adapter.session.yesbank.YesBankAPI;

public class PhonePeLoan {
    public boolean checkLoan(String amount, UPIInterface api) {
        if (api.getBalance(amount) > 1000) {
            return true;
        } else
            return false;
    }
}
