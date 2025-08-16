package com.prison.visitor;

import com.prison.common.Prisoner;
import com.prison.common.PrisonerList;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class VisitManagement implements Initializable {

    @FXML
    public TextField VisitorName;
    @FXML
    public TextField VisitorNID;
    @FXML
    public TextField VisitorRelation;
    @FXML
    public ComboBox<String> VisitorActionChoice;
    @FXML
    public ComboBox PrisonerID;
    @FXML
    public Label PrisonerName;
    @FXML
    public Label PrisonerGender;


    private Stage stage;
    private Scene scene;
    private Parent root;

    public Visitor currentVisitor;

    public void setVisitor(Visitor visitor) {
        this.currentVisitor = visitor;
    }

    public void SwitchToOnGoingStatus(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/visitor/OnGoingStatus.fxml"));
        root = loader.load();
        OnGoingStatus controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void SwitchToVisitManagement(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/visitor/VisitManagement.fxml"));
        root = loader.load();
        VisitManagement controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void SwitchToVisitorProfile(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/visitor/VisitorProfile.fxml"));
        root = loader.load();
        VisitorProfile controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void SwitchToVisitorNotification(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/visitor/VisitorNotification.fxml"));
        root = loader.load();
        VisitorNotification controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void SwitchToVisitRecord(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/visitor/VisitRecord.fxml"));
        root = loader.load();
        VisitRecord controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void SwitchToVisitorDashboard(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/visitor/VisitorDashBoard.fxml"));
        root = loader.load();
        VisitorDashBoard controller = loader.getController();
        controller.setVisitor(currentVisitor);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    private final String[] ActionChoice = {"Gift Request","Online Meetup","Offline Meetup"};

    PrisonerList plist = new PrisonerList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        VisitorActionChoice.setItems(FXCollections.observableList(List.of(ActionChoice)));
        VisitorActionChoice.getSelectionModel().select("Select request type");
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
        PrisonerGender.setText(currentPrisoner.getGender());
    }

    public Prisoner currentPrisoner;

    public void setPrisoner(Prisoner prisoner) {

        this.currentPrisoner = prisoner;
    }


}
