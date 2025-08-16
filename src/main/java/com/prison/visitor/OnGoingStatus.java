package com.prison.visitor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class OnGoingStatus {
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
}
