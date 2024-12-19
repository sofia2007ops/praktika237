package ru.bashmakova.bashmakova_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SumController {

    @FXML
    private Button btnButton;

    @FXML
    private ImageView pictr;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextField;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        try {
            double x = Double.parseDouble(xTextField.getText().toString());
            double y = Double.parseDouble(yTextField.getText().toString());
            Image image = new Image(getClass().getResourceAsStream("pic.png"));
            pictr.setImage(image);
            String result = checkArea(x, y);
            resultLabel.setText(result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Ошибка: Введите числа");
        }
    }
    private String checkArea(double x, double y) {
        if (x >= 0 && x <= 10 && y >= 0 && y <= 4) {
            if ((x == 0 || x == 10 || y == 0 || y == 4)) return "На границе";
            else return "Да";
        } else {
            return "Нет";
        }
    }
}