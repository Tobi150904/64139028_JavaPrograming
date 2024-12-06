package th.ngoviethoang.bmi_basic;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField weightField;

    @FXML
    private CheckBox asianCheckBox;

    @FXML
    private Label resultLabel;

    @FXML
    private Button calculateButton;

    @FXML
    protected void onBMIButtonClick() {
        try {
            double height = Double.parseDouble(heightField.getText()) / 100;
            double weight = Double.parseDouble(weightField.getText());
            double bmi = weight / (height * height);
            String result;

            if (asianCheckBox.isSelected()) {
                if (bmi < 17.5) {
                    result = "Thiếu cân";
                } else if (bmi < 22.99) {
                    result = "Bình thường";
                } else if (bmi < 27.99) {
                    result = "Thừa cân";
                } else {
                    result = "Béo phì";
                }
            } else {
                if (bmi < 18.5) {
                    result = "Thiếu cân";
                } else if (bmi < 24.99) {
                    result = "Bình thường";
                } else if (bmi < 29.99) {
                    result = "Thừa cân";
                } else {
                    result = "Béo phì";
                }
            }

            resultLabel.setText(String.format("Kết quả: %.2f - %s", bmi, result));
        } catch (NumberFormatException e) {
            resultLabel.setText("Vui lòng nhập số hợp lệ.");
        }
    }
}