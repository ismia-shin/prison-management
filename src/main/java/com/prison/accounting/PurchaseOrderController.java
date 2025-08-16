package com.prison.accounting;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class PurchaseOrderController
{
    @javafx.fxml.FXML
    private TableColumn PendingTC;
    @javafx.fxml.FXML
    private TableView PurchaseOrderDTV;
    @javafx.fxml.FXML
    private Label DateL;
    @javafx.fxml.FXML
    private TableColumn ReciveTC;
    @javafx.fxml.FXML
    private TextArea RejectionReasonTF;
    @javafx.fxml.FXML
    private TableColumn rejectedTC;
    @javafx.fxml.FXML
    private TableColumn DateTC;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private Label PurchaseOrderL;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ViewOrderOA(ActionEvent actionEvent) {
    }
}