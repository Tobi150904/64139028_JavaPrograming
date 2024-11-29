package com.example.mycoffehouse.controllers;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LoginController {
    @FXML
    private ImageView logoImageView;

    @FXML
    public void initialize() {
        // Gán hình ảnh từ file trong resources
        Image logo = new Image(getClass().getResourceAsStream("/images/logo.png"));
        logoImageView.setImage(logo);
    }
}

