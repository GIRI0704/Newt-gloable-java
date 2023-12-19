module com.example.multithreading {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multithreading to javafx.fxml;
    exports com.example.multithreading;
    exports com.example.multithreading.youtube;
    opens com.example.multithreading.youtube to javafx.fxml;
}