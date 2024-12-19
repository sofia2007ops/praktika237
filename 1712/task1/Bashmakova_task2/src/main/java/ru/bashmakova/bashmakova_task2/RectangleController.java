package ru.bashmakova.bashmakova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RectangleController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button btnCalculate;

    @FXML
    private TextField lblArea;

    @FXML
    private TextField lblPerimeter;

    @FXML
    void btnCalculateOnAction(ActionEvent event) {
        double a = Double.parseDouble(aTextField.getText().toString());
        double b = Double.parseDouble(bTextField.getText().toString());
        double Area = a * b;
        double Perimeter = 2 * (a + b);
        lblArea.setText("" + Area);
        lblPerimeter.setText("" + Perimeter);

    }

}
