package com.ajet.module10.day111.designpatterns.adapter.session.icicibank;

public class ICICIBankPaymentResponse {

    private String message;
    private String errorCode;
    private boolean status;

    public ICICIBankPaymentResponse(String message, String errorCode, boolean status) {
        this.message = message;
        this.errorCode = errorCode;
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
