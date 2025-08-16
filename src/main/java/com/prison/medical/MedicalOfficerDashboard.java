package com.prison.medical;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class MedicalOfficerDashboard {

    @FXML
    public TextField MedicalOfficerName;
    @FXML
    public TextField MedicalOfficerDes;
    @FXML
    public TextField MedicalOfficerSpeci;
    @FXML
    public TextField MedicalOfficerLisenceNum;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public MedicalOfficer currentVisitor;
    public void setVisitor(MedicalOfficer medicalOfficer) {
        this.currentVisitor = medicalOfficer;
    }

    public void SwitchToInmateMedicalRecord(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/medical/InmateMedicalRecord.fxml"));
        root = loader.load();
        InmateMedicalRecord controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void SwitchToMedicalInventoryRecord(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/medical/MedicalInventoryRecord.fxml"));
        root = loader.load();
        MedicalInventoryRecord controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void SwitchToMedicalItemRequest(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/medical/MedicalItemRequest.fxml"));
        root = loader.load();
        MedicalItemRequest controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void SwitchToMedicalOfficerDashboard(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/medical/MedicalOfficerDashboard.fxml"));
        root = loader.load();
        MedicalOfficerDashboard controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void SwitchToMedicalOfficerNotification(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/medical/MedicalOfficerNotification.fxml"));
        root = loader.load();
        MedicalOfficerNotification controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void Refresh(ActionEvent event) throws IOException {

        MedicalOfficerName.setText(currentVisitor.getName());
        MedicalOfficerDes.setText(currentVisitor.getDesignation());
        MedicalOfficerSpeci.setText(currentVisitor.getSpecialization());
        MedicalOfficerLisenceNum.setText(currentVisitor.getLicenseNumber());

    }
}