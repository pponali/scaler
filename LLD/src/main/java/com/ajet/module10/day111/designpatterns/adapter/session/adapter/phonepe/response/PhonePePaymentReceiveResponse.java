package com.ajet.module10.day111.designpatterns.adapter.session.adapter.phonepe.response;

public class PhonePePaymentReceiveResponse {
    private String status;
    private String message;

    public PhonePePaymentReceiveResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
