package com.prison.medical;

import com.prison.common.User;

public class MedicalOfficer extends User {

    public MedicalOfficer(String id, String name, String password) {
        super(id, name, password, "Medical Officer");
    }
}
