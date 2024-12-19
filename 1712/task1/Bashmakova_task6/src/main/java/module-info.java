module ru.bashmakova.bashmakova_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bashmakova.bashmakova_task6 to javafx.fxml;
    exports ru.bashmakova.bashmakova_task6;
}