package com.prison.accounting;

public class BudgetVarianceAlertsModel {
    String SetBudgetAlert;

    public BudgetVarianceAlertsModel(String setBudgetAlert) {
        SetBudgetAlert = setBudgetAlert;
    }

    public String getSetBudgetAlert() {
        return SetBudgetAlert;
    }

    public void setSetBudgetAlert(String setBudgetAlert) {
        SetBudgetAlert = setBudgetAlert;
    }

    @Override
    public String toString() {
        return "BudgetVarianceAlertsModel{" +
                "SetBudgetAlert='" + SetBudgetAlert + '\'' +
                '}';
    }
}
