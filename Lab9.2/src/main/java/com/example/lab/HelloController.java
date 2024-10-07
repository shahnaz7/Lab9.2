package com.example.lab;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label helloText;

    @FXML
    protected void onHelloButtonClick() {
        helloText.setText("Hello, World!");
    }

    @FXML
    protected void onWelcomeButtonClick() {
        welcomeText.setText("Welcome to Lab!");
    }
}