module com.example.hocsinh {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.hocsinh to javafx.fxml;
    exports com.example.hocsinh;
}