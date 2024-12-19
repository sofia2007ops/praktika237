package ru.bashmakova.bashmakova_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField a1TextField;

    @FXML
    private TextField a2TextField;

    @FXML
    private TextField b1TextField;

    @FXML
    private TextField b2TextField;

    @FXML
    private Button btnButton;

    @FXML
    private TextField c1TextField;

    @FXML
    private TextField c2TextField;

    @FXML
    private Label res1Label;

    @FXML
    private Label res2Label;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        double A1 = Double.parseDouble(a1TextField.getText());
        double B1 = Double.parseDouble(b1TextField.getText());
        double C1 = Double.parseDouble(c1TextField.getText());
        double A2 = Double.parseDouble(a2TextField.getText());
        double B2 = Double.parseDouble(b2TextField.getText());
        double C2 = Double.parseDouble(c2TextField.getText());
        double D = A1 * B2 - A2 * B1;
        if (D != 0) {
            double x = (C1 * B2 - C2 * B1) / D;
            double y = (A1 * C2 - A2 * C1) / D;
            res1Label.setText("x = " + x + ", y = " + y);
        } else {
            res2Label.setText("Система не имеет единственного решения.");
        }
    }
}