package com.prison.common;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {

    @FXML
    public TextField UserID;
    @FXML
    public TextField UserPassword;
    @FXML
    public ComboBox<String> UserRoleChoice;

    private final String[] RoleChoice = {"Medical Officer","Visitor"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        UserRoleChoice.getItems().addAll(RoleChoice);
    }
}
