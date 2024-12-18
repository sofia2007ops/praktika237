package ru.bashmakova.bashmakova_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class expressionController {

    @FXML
    private Button btnCalculate;

    @FXML
    private TextField gTextField;

    @FXML
    private TextField lblz;

    @FXML
    private TextField xTextField;

    @FXML
    void btnCalculateOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText().toString());
        double g = Double.parseDouble(gTextField.getText().toString());
        double y = x + Math.sqrt(Math.abs(1 - x * x));
        double z = Math.pow(Math.sin(2 * (x + g)), 2) + (Math.cos(x) / (x + Math.pow(y, 2) * Math.log(Math.abs(x - y))));
        lblz.setText("z = " + z);
    }

    public void onHelloButtonClick(ActionEvent actionEvent) {

    }
}