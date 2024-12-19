package ru.bashmakova.bashmakova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField STextField;

    @FXML
    private TextField TTextField;

    @FXML
    private TextField V1TextField;

    @FXML
    private TextField V2TextField;

    @FXML
    private Button btnCalculate;

    @FXML
    private TextField lblRest;

    @FXML
    void btnCalculateOnAction(ActionEvent event) {
        double V1 = Double.parseDouble(V1TextField.getText().toString());
        double V2 = Double.parseDouble(V2TextField.getText().toString());
        double S = Double.parseDouble(STextField.getText().toString());
        double T = Double.parseDouble(TTextField.getText().toString());
        double tDistance = T * (V1 + V2);
        double fDistance = Math.abs(S - tDistance);
        lblRest.setText("" + fDistance);
    }
}