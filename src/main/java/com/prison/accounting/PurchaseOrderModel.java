package com.prison.accounting;

public class PurchaseOrderModel {
    String RejectionReason;

    public PurchaseOrderModel(String rejectionReason) {
        RejectionReason = rejectionReason;
    }

    public String getRejectionReason() {
        return RejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        RejectionReason = rejectionReason;
    }

    @Override
    public String toString() {
        return "PurchaseOrderModel{" +
                "RejectionReason='" + RejectionReason + '\'' +
                '}';
    }
}

