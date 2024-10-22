module com.example.caro {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    opens com.example.caro to javafx.fxml;
    exports com.example.caro;
}