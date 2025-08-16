package com.prison.visitor;

import com.prison.common.User;

public class Visitor extends User {


    private String NID;
    private String PhoneNumber;
    private String BirthDate;

    public Visitor(String id, String name, String password, String nid, String phone_number, String birth_date) {

        super(id, name, password, "Visitor");

        this.NID = nid;
        this.PhoneNumber = phone_number;
        this.BirthDate = birth_date;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getNID() {
        return NID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getBirthDate() {
        return BirthDate;
    }
}
