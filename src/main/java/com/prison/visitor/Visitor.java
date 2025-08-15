package com.prison.visitor;

import com.prison.common.User;

public class Visitor extends User {

    public Visitor(String id, String name, String password) {
        super(id, name, password, "Visitor");
    }

}
