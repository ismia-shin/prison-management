package com.prison.common;

import com.prison.visitor.Visitor;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import com.prison.common.UserList;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;



public class Login implements Initializable {


    @FXML
    public TextField UserID;
    @FXML
    public TextField UserPassword;
    @FXML
    public ComboBox<String> UserRoleChoice;
    @FXML
    public Button LoginButton;

    private static final String[] RoleChoice = {"Medical Officer","Visitor"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        UserRoleChoice.setItems(FXCollections.observableList(List.of(RoleChoice)));
        UserRoleChoice.getSelectionModel().select("Select role");


    }

    public void setLoginButton(ActionEvent event){

        String Role = UserRoleChoice.getValue();
        String current_id = UserID.getText();
        String current_password = UserPassword.getText();

        Stage stage;
        Scene scene;
        Parent root;

        if (Objects.equals(Role, "Visitor")){
            if (Objects.equals(current_id,UserList.visitor1.id) && Objects.equals(current_password, UserList.visitor1.password)){
                try {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/prison/visitor/VisitorDashboard.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }

        if (Objects.equals(Role,"Medical Officer")){
            if (Objects.equals(current_id, UserList.medicalOfficer1.id) && Objects.equals(current_password, UserList.medicalOfficer1.password)){
                try {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/prison/medical/MedicalOfficerDashboard.fxml")));
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
    }
}
