package com.prison.common;

public abstract class User {

    protected final String id;
    protected final String name;
    protected final String password;
    protected final String role;

    protected User(String id, String name, String password, String role ){

        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }


}
