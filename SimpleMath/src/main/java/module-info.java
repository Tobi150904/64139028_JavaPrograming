module th.ngoviethoang.simplemath.simplemath {
    requires javafx.controls;
    requires javafx.fxml;


    opens th.ngoviethoang.simplemath to javafx.fxml;
    exports th.ngoviethoang.simplemath;
}