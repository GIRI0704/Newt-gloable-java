module com.example.newtgloablejava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newtgloablejava to javafx.fxml;
    exports com.example.newtgloablejava;
    exports com.example.newtgloablejava.FuctionalInterface;
    opens com.example.newtgloablejava.FuctionalInterface to javafx.fxml;
}