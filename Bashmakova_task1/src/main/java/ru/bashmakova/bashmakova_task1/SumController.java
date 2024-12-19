package ru.bashmakova.bashmakova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private TextField CTextField;

    @FXML
    private Button btnButton;

    @FXML
    private TextField resultLabel;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(ATextField.getText().toString());
        double b = Double.parseDouble(BTextField.getText().toString());
        double c = Double.parseDouble(CTextField.getText().toString());
        if (a == 0) {
            resultLabel.setText("Уравнение не является квадратным.");
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                resultLabel.setText("Два решения.");
            } else if (discriminant == 0) {
                resultLabel.setText("Одно решение.");
            } else {
                resultLabel.setText("Нет решений.");

            }
        }
    }
}