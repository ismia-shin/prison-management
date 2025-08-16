package com.prison.guardSupervisor;

public class ManageGuardsModel {
    String Editperformanceremark;
    Integer SalaryCheack;

    public ManageGuardsModel(String editperformanceremark, Integer salaryCheack) {
        Editperformanceremark = editperformanceremark;
        SalaryCheack = salaryCheack;
    }

    public String getEditperformanceremark() {
        return Editperformanceremark;
    }

    public void setEditperformanceremark(String editperformanceremark) {
        Editperformanceremark = editperformanceremark;
    }

    public Integer getSalaryCheack() {
        return SalaryCheack;
    }

    public void setSalaryCheack(Integer salaryCheack) {
        SalaryCheack = salaryCheack;
    }

    @Override
    public String toString() {
        return "ManageGuardsModel{" +
                "Editperformanceremark='" + Editperformanceremark + '\'' +
                ", SalaryCheack=" + SalaryCheack +
                '}';
    }
}
