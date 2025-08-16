package com.prison.guardSupervisor;

public class AttendSecurityMeetingfxmlModel {
    String addTopic;

    public AttendSecurityMeetingfxmlModel(String addTopic) {
        this.addTopic = addTopic;
    }

    public String getAddTopic() {
        return addTopic;
    }

    public void setAddTopic(String addTopic) {
        this.addTopic = addTopic;
    }

    @Override
    public String toString() {
        return "AttendSecurityMeetingfxmlModel{" +
                "addTopic='" + addTopic + '\'' +
                '}';
    }
}
