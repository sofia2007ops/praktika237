package ru.bashmakova.bashmakova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DistanceController {

    @FXML
    private TextField X1TextField;

    @FXML
    private TextField X2TextField;

    @FXML
    private Button btnCalculate;

    @FXML
    private TextField lblDictance;

    @FXML
    void btnCalculateOnAction(ActionEvent event) {
        double X1 = Double.parseDouble(X1TextField.getText().toString());
        double X2 = Double.parseDouble(X2TextField.getText().toString());
        double Distance = Math.abs(X2 - X1);
        lblDictance.setText("" + Distance);

    }

}
