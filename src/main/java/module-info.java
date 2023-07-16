module com.example.week9quiz {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.week9quiz to javafx.fxml;
    exports com.example.week9quiz;
}