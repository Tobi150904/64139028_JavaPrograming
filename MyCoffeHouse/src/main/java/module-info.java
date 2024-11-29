module com.example.mycoffehouse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mycoffehouse to javafx.fxml;
    exports com.example.mycoffehouse;
    exports com.example.mycoffehouse.controllers;
    opens com.example.mycoffehouse.controllers to javafx.fxml;
}