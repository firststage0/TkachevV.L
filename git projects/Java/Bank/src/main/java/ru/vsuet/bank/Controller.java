package ru.vsuet.bank;

import assets.Shake;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import service.ControllerService;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button registerButton;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;
    protected static boolean checkUser;
    protected static String loginText;
    protected static String loginPassword;
    @FXML
    void initialize() {

        signUpButton.setOnAction(actionEvent -> {
            loginText = login_field.getText().trim();
            loginPassword = password_field.getText().trim();
            checkUser = ControllerService.checkUser(loginText, loginPassword);
            if(checkUser){
                ControllerService.loginUser(loginText, loginPassword);
                signUpButton.getScene().getWindow().hide();
                ControllerService.openNewScene("/ru/vsuet/bank/app.fxml");
            } else {
                Anim();
            }
        });

        registerButton.setOnAction(actionEvent1 -> {
            signUpButton.getScene().getWindow().hide();
            ControllerService.openNewScene("/ru/vsuet/bank/registerwindow.fxml");
        });
    }

    public void Anim(){
        Shake userLoginAnim = new Shake(login_field);
        Shake userPasswordAnim = new Shake(password_field);
        userLoginAnim.PlayAnim();
        userPasswordAnim.PlayAnim();
    }

}
