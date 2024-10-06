package com.example.bmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIController {
    @FXML
    private TextField weightField;

    @FXML
    private TextField heightField;

    @FXML
    private Label resultLabel;

    @FXML
    protected void onCalculateButtonClick() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());
            double bmi = weight / (height * height);
            resultLabel.setText(String.format("BMI la %.2f", bmi));
        } catch (NumberFormatException e) {
            resultLabel.setText("Vui lòng nhập số hợp lệ.");
        }
    }
}