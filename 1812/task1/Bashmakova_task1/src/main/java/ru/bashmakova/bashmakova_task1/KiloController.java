package ru.bashmakova.bashmakova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class KiloController {

    @FXML
    private TextField FileSizeTextField;

    @FXML
    private TextField KiloBytesLabel;

    @FXML
    private Button btnCalculate;

    @FXML
    void btnCalculateOnAction(ActionEvent event) {

        int FileSize = Integer.parseInt(FileSizeTextField.getText().toString());
        float kiloBytes = FileSize / 1024;
        KiloBytesLabel.setText(" " + String.format("%.3f",kiloBytes));
    }
}