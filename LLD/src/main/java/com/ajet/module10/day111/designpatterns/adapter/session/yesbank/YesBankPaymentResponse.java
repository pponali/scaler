package com.ajet.module10.day111.designpatterns.adapter.session.yesbank;

public class YesBankPaymentResponse {

        private String message;
        private String errorCode;
        private String transactionId;
        private boolean transactionStatus;

        public YesBankPaymentResponse(String message, String errorCode, String transactionId, boolean transactionStatus) {
            this.message = message;
            this.errorCode = errorCode;
            this.transactionId = transactionId;

            this.transactionStatus = transactionStatus;
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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public boolean isTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(boolean transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
