package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.response;

public class PhonePePaymentPayResponse {
    boolean isPaymentSuccess;
    String paymentId;

    public PhonePePaymentPayResponse(boolean isPaymentSuccess, String paymentId) {
        this.isPaymentSuccess = isPaymentSuccess;
        this.paymentId = paymentId;
    }

    public boolean isPaymentSuccess() {
        return isPaymentSuccess;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentSuccess(boolean paymentSuccess) {
        isPaymentSuccess = paymentSuccess;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
