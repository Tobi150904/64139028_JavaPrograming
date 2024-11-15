package com.example.bmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class BMIController {
    @FXML
    private TextField weightField;

    @FXML
    private TextField heightField;

    @FXML
    private TextField byteField;

    @FXML
    private Label resultLabel;

    @FXML
    private Label bitResultLabel;

    private Queue<String> history = new LinkedList<>();

    @FXML
    protected void onCalculateButtonClick() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());
            double bmi = weight / (height * height);
            String result = String.format("BMI là %.2f", bmi);
            resultLabel.setText(result);
            logHistory(result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Vui lòng nhập số hợp lệ.");
        }
    }

    @FXML
    protected void onConvertButtonClick() {
        try {
            double bytes = Double.parseDouble(byteField.getText());
            double bits = bytes * 8;
            String result = String.format("%.2f bytes = %.2f bits", bytes, bits);
            bitResultLabel.setText(result);
            logHistory(result);
        } catch (NumberFormatException e) {
            bitResultLabel.setText("Vui lòng nhập số hợp lệ.");
        }
    }

    private void logHistory(String entry) {
        if (history.size() >= 10) {
            history.poll();
        }
        history.add(entry);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.write(entry);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}