package com.prison.visitor;

import java.util.ArrayList;

public class VisitorList {
    private ArrayList<Visitor> visitors;

    public VisitorList() {
        visitors = new ArrayList<>();
        visitors.add(new Visitor("1", "John Doe", "1234", "1234567890", "01711111111", "1990-05-15"));
        visitors.add(new Visitor("2", "Jane Smith", "1234", "9876543210", "01722222222", "1985-09-10"));
        visitors.add(new Visitor("3", "Alice Johnson", "1234", "1122334455", "01733333333", "1992-12-25"));
        visitors.add(new Visitor("4", "Bob Brown", "1234", "5566778899", "01744444444", "1988-03-07"));
    }

    public ArrayList<Visitor> getAllVisitors() {
        return visitors;
    }

    public Visitor isVisitorExist(String id, String password) {
        for (Visitor v : visitors) {
            if (v.getId().equals(id) && v.getPassword().equals(password)) {
                return v;
            }
        }
        return null;
    }
}
