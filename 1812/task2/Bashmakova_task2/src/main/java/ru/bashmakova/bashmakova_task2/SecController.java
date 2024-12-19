package ru.bashmakova.bashmakova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SecController {

    @FXML
    private Button btnCalculater;

    @FXML
    private TextField minuteslbl;

    @FXML
    private TextField secondsTextField;

    @FXML
    void calculateOnAction(ActionEvent event) {
        int second = Integer.parseInt(secondsTextField.getText().toString());
        int minutes = (second % 3600) / 60;
        minuteslbl.setText(" " + minutes);

    }

}
