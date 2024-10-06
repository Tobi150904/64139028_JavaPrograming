module com.example.bmi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.bmi to javafx.fxml;
    exports com.example.bmi;
}