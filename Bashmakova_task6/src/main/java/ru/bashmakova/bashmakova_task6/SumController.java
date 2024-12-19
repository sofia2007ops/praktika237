package ru.bashmakova.bashmakova_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnButton;

    @FXML
    private TextField nTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(nTextField.getText().toString());
        String description;
        if (number == 0) {
            description = "нулевое число";
        } else if (number > 0) {
            description = (number % 2 == 0) ? "положительное четное число" : "положительное нечетное число";
        } else {
            description = (number % 2 == 0) ? "отрицательное четное число" : "отрицательное нечетное число";
        }

        resultLabel.setText(description);
    }
}