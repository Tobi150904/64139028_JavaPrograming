package com.example.tinhtong;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {
    @FXML
    private TextField number1;

    @FXML
    private TextField number2;

    @FXML
    private Label resultLabel;

    @FXML
    protected void onCalculateSum() {
        try {
            double num1 = Double.parseDouble(number1.getText());
            double num2 = Double.parseDouble(number2.getText());
            double sum = num1 + num2;
            resultLabel.setText("Tổng: " + sum);
        } catch (NumberFormatException e) {
            resultLabel.setText("Vui lòng nhập số hợp lệ");
        }
    }
}