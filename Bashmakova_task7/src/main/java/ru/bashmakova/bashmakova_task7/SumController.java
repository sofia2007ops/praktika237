package ru.bashmakova.bashmakova_task7;

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
        int number = Integer.parseInt(nTextField.getText());
        String description = "";
        if (number < 1 || number > 999) {
            description = "Число вне диапазона";
        } else {
            String parity = (number % 2 == 0) ? "четное" : "нечетное";
            String digits = (number < 10) ? "однозначное" : (number < 100) ? "двузначное" : "трехзначное";

            description = parity + " " + digits + " число";
        }

        resultLabel.setText(description);
    }
}