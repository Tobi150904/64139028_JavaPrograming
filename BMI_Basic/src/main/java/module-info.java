module th.ngoviethoang.bmi_basic {
    requires javafx.controls;
    requires javafx.fxml;


    opens th.ngoviethoang.bmi_basic to javafx.fxml;
    exports th.ngoviethoang.bmi_basic;
}