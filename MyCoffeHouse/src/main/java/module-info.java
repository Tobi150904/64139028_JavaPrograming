module com.example.mycoffehouse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mycoffehouse to javafx.fxml;
    exports com.example.mycoffehouse;
}