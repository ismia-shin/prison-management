module com.example.prison_management_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prison_management_system to javafx.fxml;
    exports com.example.prison_management_system;
}