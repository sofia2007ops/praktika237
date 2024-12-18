package ru.bashmakova.bashmakova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField DayweekTF;

    @FXML
    private TextField KTextField;

    @FXML
    private Button ResultButton;

    @FXML
    void ResultButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(KTextField.getText().toString());
        int b = (a) % 7;
        if (1 <= a && a <= 365)
            switch (b) {
                case 0:
                    DayweekTF.setText("День недели: воскресенье");
                    break;
                case 1:
                    DayweekTF.setText("День недели:понедельник");
                    break;
                case 2:
                    DayweekTF.setText("День недели:вторник");
                    break;
                case 3:
                    DayweekTF.setText("День недели:среда");
                    break;
                case 4:
                    DayweekTF.setText("День недели:четверг");
                    break;
                case 5:
                    DayweekTF.setText("День недели:пятница");
                    break;
                case 6:
                    DayweekTF.setText("День недели:суббота");
                    break;
            }
        else
            DayweekTF.setText("введите число попадающее под текущий год");

    }

}
