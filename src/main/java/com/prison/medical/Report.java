package com.prison.medical;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Report {

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
}
