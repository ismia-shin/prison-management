package com.prison.common;

public class Prisoner {

    public String Name;
    public String ID;
    public String Gender;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Prisoner(String Name, String ID, String Gender ){

        this.Name = Name;
        this.ID = ID;
        this.Gender = Gender;


    }
}
