package com.prison.accounting;

public class ForecastCashFlowModel {

    String AssumptionInput;

    public ForecastCashFlowModel(String assumptionInput) {
        AssumptionInput = assumptionInput;
    }

    public String getAssumptionInput() {
        return AssumptionInput;
    }

    public void setAssumptionInput(String assumptionInput) {
        AssumptionInput = assumptionInput;
    }

    @Override
    public String toString() {
        return "ForecastCashFlowModel{" +
                "AssumptionInput='" + AssumptionInput + '\'' +
                '}';
    }
}
