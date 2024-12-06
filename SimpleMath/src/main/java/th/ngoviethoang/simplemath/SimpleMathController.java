package th.ngoviethoang.simplemath;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class SimpleMathController {

    @FXML
    private TextField numberA;

    @FXML
    private TextField numberB;

    @FXML
    private RadioButton radioAdd;

    @FXML
    private RadioButton radioSubtract;

    @FXML
    private RadioButton radioMultiply;

    @FXML
    private RadioButton radioDivide;

    @FXML
    private Button buttonCalculate;

    @FXML
    private Label textResult;

    @FXML
    public void initialize() {
        buttonCalculate.setOnAction(event -> calculateResult());
    }

    private void calculateResult() {
        try {
            double a = Double.parseDouble(numberA.getText());
            double b = Double.parseDouble(numberB.getText());
            double result = 0;

            if (radioAdd.isSelected()) {
                result = a + b;
            } else if (radioSubtract.isSelected()) {
                result = a - b;
            } else if (radioMultiply.isSelected()) {
                result = a * b;
            } else if (radioDivide.isSelected()) {
                if (b != 0) {
                    result = a / b;
                } else {
                    textResult.setText("Kết quả: Không thể chia cho 0");
                    return;
                }
            }

            textResult.setText("Kết quả: " + result);
        } catch (NumberFormatException e) {
            textResult.setText("Kết quả: Vui lòng nhập số hợp lệ");
        }
    }
}