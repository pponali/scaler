package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe;

import com.ajet.module10.day111.designpatterns.adapter.session.yesbank.YesBankAPI;

public class PhonePeLoan {

        public boolean checkLoan(String accountNumber, YesBankAPI api){
            if(api.checkBalance(accountNumber) > 1000){
                return true;
            } else
                return false;
        }
}
