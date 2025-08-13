module com.prison.prisonmanagement {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.prison.medical to javafx.fxml;
    opens com.prison.visitor to javafx.fxml;

    opens com.prison to javafx.fxml;
    exports com.prison;
}