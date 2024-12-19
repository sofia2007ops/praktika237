package ru.bashmakova.bashmakova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField NTextField;

    @FXML
    private Button btnButton;

    @FXML
    private TextField resultLabel;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(NTextField.getText().toString());
        if (number > 0) {
            number -= 8;
        } else if (number < 0) {
            number += 6;
        } else {
            number = 10;
        }
        resultLabel.setText("Результат: " + number);
    }
}