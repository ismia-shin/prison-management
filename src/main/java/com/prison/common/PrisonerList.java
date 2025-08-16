package com.prison.common;

import com.prison.medical.MedicalOfficer;

import java.util.ArrayList;

public class PrisonerList {

    private ArrayList<Prisoner> prisoners;

    public PrisonerList(){

        prisoners = new ArrayList<>();

        prisoners.add(new Prisoner("Sam", "11","Female"));
        prisoners.add(new Prisoner("Adnan", "12","Male"));
        prisoners.add(new Prisoner("Rahim", "13","Male"));
        prisoners.add(new Prisoner("Karim", "14","Male"));

    }

    public ArrayList<Prisoner> getAllPrisoners() {

        return prisoners;

    }

    public ArrayList<String> getAllPrisonerID() {

        ArrayList<String> PrisonerID = new ArrayList<String>();
        for (Prisoner p : prisoners){
            PrisonerID.add(p.getID());

        }
        return PrisonerID;
    }

}
