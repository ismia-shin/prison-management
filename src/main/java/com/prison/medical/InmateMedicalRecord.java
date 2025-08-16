package com.prison.medical;

import com.prison.common.Prisoner;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.ArrayList;
import com.prison.common.PrisonerList;

public class InmateMedicalRecord implements Initializable {

    @FXML
    public ComboBox PrisonerID;
    @FXML
    public Label PrisonerName;

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

    public void SwitchToReport(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/medical/Report.fxml"));
        root = loader.load();
        Report controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void SwitchToTestOrder(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/medical/TestOrder.fxml"));
        root = loader.load();
        TestOrder controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    PrisonerList plist = new PrisonerList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        PrisonerID.getItems().addAll(plist.getAllPrisonerID());
        PrisonerID.setOnAction(this::setLabel);

    }

    private void setLabel(Event event) {

        String ChosenID = PrisonerID.getValue().toString();
        for (Prisoner p : plist.getAllPrisoners()){
            if (p.getID().equals(ChosenID)){
                setPrisoner(p);
            }
        }

        PrisonerName.setText(currentPrisoner.getName());
    }

    public Prisoner currentPrisoner;

    public void setPrisoner(Prisoner prisoner) {

        this.currentPrisoner = prisoner;
    }



}