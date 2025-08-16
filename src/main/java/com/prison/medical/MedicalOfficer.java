package com.prison.medical;

import com.prison.common.User;

public class MedicalOfficer extends User {


    public String Designation;
    public String Specialization;
    public String LicenseNumber;

    public MedicalOfficer(String id, String name, String password, String designation, String specialization, String licenseNumber) {

        super(id, name, password, "Medical Officer");

        this.Designation = designation;
        this.Specialization = specialization;
        this.LicenseNumber = licenseNumber;
    }

    public void setDesignation(String designation) {

        Designation = designation;
    }

    public void setSpecialization(String specialization) {

        Specialization = specialization;
    }

    public void setLicenseNumber(String licenseNumber) {
        LicenseNumber = licenseNumber;
    }

    public String getDesignation() {
        return Designation;
    }

    public String getSpecialization() {

        return Specialization;
    }

    public String getLicenseNumber() {

        return LicenseNumber;
    }
}
