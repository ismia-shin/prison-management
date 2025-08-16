package com.prison.visitor;


import java.util.ArrayList;

public class Record {

    private ArrayList<VisitRequest> records;

    public Record() {
        records = new ArrayList<>();
    }

    public ArrayList<VisitRequest> getAllVistRequest() {
        return records;
    }


}
