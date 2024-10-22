module com.example.caro {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.caro to javafx.fxml;
    exports com.example.caro;
}