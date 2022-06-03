package com.example.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerLicznik {
    public Button btnMain;
    public TextField txtLicznik;
    int clickCounter = 0;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onBtnAction() { welcomeText.setText("Welcome to JavaFX Application!");}

    public void onBtnAction2(ActionEvent actionEvent) {
        System.out.println("Kliknięcie nr " + ++clickCounter);
        txtLicznik.setText(String.valueOf(+clickCounter));
    }
}
