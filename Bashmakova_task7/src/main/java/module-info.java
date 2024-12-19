module ru.bashmakova.bashmakova_task7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bashmakova.bashmakova_task7 to javafx.fxml;
    exports ru.bashmakova.bashmakova_task7;
}