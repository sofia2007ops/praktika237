package ru.bashmakova.bashmakova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label Result;

    @FXML
    private Button btnButton;

    @FXML
    private TextField xTextField;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText().toString());
        double y;
        if (x > -Math.PI / 2 && x < Math.PI / 2) {
            y = Math.sqrt(Math.abs(Math.sin(x) + Math.pow(Math.tan(2 * x), 2) / (3.5 * Math.cos(x))));
        } else if (x > Math.PI / 2 && x < Math.PI) {
            y = Math.cos(x / 3) / Math.sin(x) + Math.pow(Math.tan(2 * x), 2);
        } else {
            Result.setText("Введите x в допустимом диапазоне.");
            return;
        }
        Result.setText("y:" + y);
    }
}