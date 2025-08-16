package com.prison.guardSupervisor;

public class LogAndReportIncidentModel {
    String Details;

    public LogAndReportIncidentModel(String details) {
        Details = details;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    @Override
    public String toString() {
        return "LogAndReportIncidentModel{" +
                "Details='" + Details + '\'' +
                '}';
    }
}
