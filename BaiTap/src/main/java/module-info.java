module com.example.baitap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baitap to javafx.fxml;
    exports com.example.baitap;
}