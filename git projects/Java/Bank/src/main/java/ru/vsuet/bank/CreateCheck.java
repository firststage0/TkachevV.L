package ru.vsuet.bank;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import service.CreateCheckService;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateCheck extends CreateCheckService{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button createCheckButton;

    @FXML
    private TextField checkNumber;

    @FXML
    void initialize() {
        createCheckButton.setOnAction(actionEvent -> {
            String loginText = AppMain.loginText;
            String checkName = checkNumber.getText().trim();
            CreateCheckService.CreateCheck(checkName, loginText);
        });
    }


}
