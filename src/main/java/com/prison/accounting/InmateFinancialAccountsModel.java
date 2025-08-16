package com.prison.accounting;

public class InmateFinancialAccountsModel {
    Integer DepositAmount;

    public InmateFinancialAccountsModel(Integer depositAmount) {
        DepositAmount = depositAmount;
    }

    public Integer getDepositAmount() {
        return DepositAmount;
    }

    public void setDepositAmount(Integer depositAmount) {
        DepositAmount = depositAmount;
    }

    @Override
    public String toString() {
        return "InmateFinancialAccountsModel{" +
                "DepositAmount=" + DepositAmount +
                '}';
    }
}
