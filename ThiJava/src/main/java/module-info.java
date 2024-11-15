module com.example.thijava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thijava to javafx.fxml;
    exports com.example.thijava;
}