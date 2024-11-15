package com.example.tracnghiem;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.util.Random;

public class MathQuizController {
    @FXML
    private TextField timerLabel;
    @FXML
    private TextField scoreLabel;
    @FXML
    private TextField aField;
    @FXML
    private TextField bField;
    @FXML
    private TextField operationField;
    @FXML
    private Button answerButton1;
    @FXML
    private Button answerButton2;
    @FXML
    private Button answerButton3;
    @FXML
    private Button answerButton4;

    private int correctAnswer;
    private int score = 0;
    private int timer = 5;
    private Timeline timeline;

    @FXML
    public void initialize() {
        generateQuestion();
        startTimer();
    }

    private void generateQuestion() {
        Random rand = new Random();
        int a = rand.nextInt(10) + 1;
        int b = rand.nextInt(10) + 1;
        String[] operations = {"+", "-", "*", "/", "div", "mod"};
        String operation = operations[rand.nextInt(operations.length)];

        aField.setText(String.valueOf(a));
        bField.setText(String.valueOf(b));
        operationField.setText(operation);

        switch (operation) {
            case "+" -> correctAnswer = a + b;
            case "-" -> correctAnswer = a - b;
            case "*" -> correctAnswer = a * b;
            case "/" -> correctAnswer = b != 0 ? a / b : 0;
            case "div" -> correctAnswer = b != 0 ? a / b : 0;
            case "mod" -> correctAnswer = b != 0 ? a % b : 0;
        }

        int correctPosition = rand.nextInt(4);

        Button[] buttons = {answerButton1, answerButton2, answerButton3, answerButton4};
        for (int i = 0; i < 4; i++) {
            if (i == correctPosition) {
                buttons[i].setText(String.valueOf(correctAnswer));
            } else {
                int wrongAnswer;
                do {
                    wrongAnswer = correctAnswer + rand.nextInt(10) - 5;
                } while (wrongAnswer == correctAnswer);
                buttons[i].setText(String.valueOf(wrongAnswer));
            }
            buttons[i].setStyle("-fx-background-color: lightgray;");
        }
    }

    private void startTimer() {
        timer = 5;
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            timer--;
            timerLabel.setText("Thời gian: " + timer);
            if (timer <= 0) {
                timeline.stop();
                generateQuestion();
                startTimer();
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    @FXML
    private void checkAnswer(javafx.event.ActionEvent event) {
        Button selectedButton = (Button) event.getSource();
        if (Integer.parseInt(selectedButton.getText()) == correctAnswer) {
            selectedButton.setStyle("-fx-background-color: green;");
            score++;
            scoreLabel.setText("Điểm: " + score);
        } else {
            selectedButton.setStyle("-fx-background-color: red;");
        }
        timeline.stop();
        generateQuestion();
        startTimer();
    }
}