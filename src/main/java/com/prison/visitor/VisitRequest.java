package com.prison.visitor;

import java.time.LocalDate;
import java.util.SplittableRandom;

public class VisitRequest {

    public String Name;
    public String Relation;
    public String NID;
    public String Action;
    public String PrisonerID;
    public LocalDate Date;
    public String PrisonerName;
    public String PrisonerGender;
    public String Status;

    public VisitRequest(String Name, String Relation, String NID, String Action, String PrisonerID, LocalDate Date, String PrisonerName, String PrisonerGender){

        this.Name = Name;
        this.NID = NID;
        this.Relation = Relation;
        this.Action = Action;
        this.PrisonerID = PrisonerID;
        this.Date = Date;
        this.PrisonerName = PrisonerName;
        this.PrisonerGender = PrisonerGender;
        this.Status = "Pending";


    }



}
