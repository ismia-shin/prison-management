package com.prison.common;

import com.prison.medical.MedicalOfficerDashboard;
import com.prison.visitor.VisitorDashBoard;
import com.prison.visitor.VisitorList;
import com.prison.visitor.Visitor;
import com.prison.medical.MedicalOfficer;
import com.prison.medical.MedicalOfficersList;

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

    public void setLoginButton(ActionEvent event) throws IOException {

        String Role = UserRoleChoice.getValue();
        String current_id = UserID.getText();
        String current_password = UserPassword.getText();

        Stage stage;
        Scene scene;
        Parent root;

        if (Objects.equals(Role, "Visitor")){
            VisitorList vlist = new VisitorList();
            Visitor v = vlist.isVisitorExist(current_id, current_password);
            if (v != null){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/visitor/VisitorDashboard.fxml"));
                try {
                    root = loader.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                VisitorDashBoard controller = loader.getController();

                controller.setVisitor(v);

                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else{
                System.out.println("visitor doesn't exist.");
            }
        }

        if (Objects.equals(Role,"Medical Officer")){
            MedicalOfficersList mlist = new MedicalOfficersList();
            MedicalOfficer m = mlist.isOfficerExist(current_id, current_password);
            if (m != null){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/prison/medical/MedicalOfficerDashboard.fxml"));

                try {
                    root = loader.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                MedicalOfficerDashboard controller = loader.getController();

                controller.setVisitor(m);

                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else{
                System.out.println("Medical Officer doesn't exist.");
            }
        }
    }
}
