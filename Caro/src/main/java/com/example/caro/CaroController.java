package com.example.caro;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CaroController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}