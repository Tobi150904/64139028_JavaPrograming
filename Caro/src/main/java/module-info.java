module com.example.caro {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;

    opens com.example.caro to javafx.fxml;
    exports com.example.caro;
}