package com.example.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public Button btnMain;
    public TextField promien;
    public TextField wysokosc;
    public TextField grubosc;
    public TextField wynik;
    public TextField error;
    public TextField wynik2;
    public TextField cena;
    public TextField cenaD;
    double s1 = 0;
    double pi = 3.14;
    double s2 = 0;
    double cena1 = 0;
    double cena2 = 0;



    public void onBtnAction(ActionEvent actionEvent) {
        Double r = Double.valueOf(promien.getText());
        Double h = Double.valueOf(wysokosc.getText());
        Double g = Double.valueOf(grubosc.getText());
        if (g > r) {
            error.setText("Grubość nie może być większa od promienia!!");
        }
        else {
            Double s1 = ((pi * h * (r * r - g * g)) * 7.7) / 1000;
            Double s2 = (pi * h * (r * r - g * g) * 7.85) / 1000;
            //Integer s2 =
            wynik.setText(s1.toString());
            wynik2.setText(s2.toString());

            Double cena1 = s1 * 3;
            Double cena2 = s2 * 7.7;

            cena.setText(cena1.toString());
            cenaD.setText(cena2.toString());
        }
    }
}