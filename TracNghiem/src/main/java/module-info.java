module com.example.tracnghiem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.tracnghiem to javafx.fxml;
    exports com.example.tracnghiem;
}