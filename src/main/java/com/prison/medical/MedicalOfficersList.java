package com.prison.medical;

import java.util.ArrayList;

public class MedicalOfficersList {
    private ArrayList<MedicalOfficer> officers;

    public MedicalOfficersList() {
        officers = new ArrayList<>();
        officers.add(new MedicalOfficer(
                "5", "Dr. Sarah Khan", "123",
                "Senior Surgeon", "Cardiology", "LIC-2025-789"
        ));
        officers.add(new MedicalOfficer(
                "6", "Dr. Imran Hossain", "123",
                "Chief Medical Officer", "Orthopedics", "LIC-2023-555"
        ));
        officers.add(new MedicalOfficer(
                "7", "Dr. Anita Das", "123",
                "Resident Doctor", "Neurology", "LIC-2024-111"
        ));
        officers.add(new MedicalOfficer(
                "8", "Dr. Kamal Ahmed", "123",
                "Medical Officer", "General Medicine", "LIC-2022-333"
        ));
    }

    public ArrayList<MedicalOfficer> getAllMedicalOfficers() {
        return officers;
    }

    public MedicalOfficer isOfficerExist(String id, String password) {
        for (MedicalOfficer m : officers) {
            if (m.getId().equals(id) && m.getPassword().equals(password)) {
                return m;
            }
        }
        return null;
    }
}
