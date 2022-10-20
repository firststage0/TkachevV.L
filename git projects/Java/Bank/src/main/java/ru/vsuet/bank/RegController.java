package ru.vsuet.bank;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField FirstNameField;

    @FXML
    private Button SignUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField secondNameField;

    @FXML
    void initialize() {
        SignUpButton.setOnAction(actionEvent -> {

            SignUpNewUser();

            SignUpButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ru/vsuet/bank/mainwindow.fxml"));

            try{
                loader.load();
            }   catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();


        });


    }

    private void SignUpNewUser() {
        DBHandler dbHandler = new DBHandler();

        String firstname = FirstNameField.getText();
        String secondname = secondNameField.getText();
        String loginField = login_field.getText();
        String password = password_field.getText();

        User user = new User(firstname, secondname, loginField, password);

        dbHandler.signUpUser(user);

    }

}
