package com.prison.guardSupervisor;

public class LogSurpriseChecksModel {
    String AddNote;

    public LogSurpriseChecksModel(String addNote) {
        AddNote = addNote;
    }

    public String getAddNote() {
        return AddNote;
    }

    public void setAddNote(String addNote) {
        AddNote = addNote;
    }

    @Override
    public String toString() {
        return "LogSurpriseChecksModel{" +
                "AddNote='" + AddNote + '\'' +
                '}';
    }
}
