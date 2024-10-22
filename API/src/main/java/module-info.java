module com.example.api {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.api to javafx.fxml;
    exports com.example.api;
}