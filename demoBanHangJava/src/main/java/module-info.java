module com.example.demobanhangjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.demobanhangjava to javafx.fxml;
    exports com.example.demobanhangjava;
}