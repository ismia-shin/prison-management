package com.prison.guardSupervisor;

public class CondictRandomCellSearchModel {
    String CellNo, Report;

    public CondictRandomCellSearchModel(String report, String cellNo) {
        Report = report;
        CellNo = cellNo;
    }

    public String getCellNo() {
        return CellNo;
    }

    public void setCellNo(String cellNo) {
        CellNo = cellNo;
    }

    public String getReport() {
        return Report;
    }

    public void setReport(String report) {
        Report = report;
    }

    @Override
    public String toString() {
        return "CondictRandomCellSearchModel{" +
                "CellNo='" + CellNo + '\'' +
                ", Report='" + Report + '\'' +
                '}';
    }
}
