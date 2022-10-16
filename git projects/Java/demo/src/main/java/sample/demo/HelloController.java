package sample.demo;


import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import animations.Shake;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonIn;

    @FXML
    private Button RegisterButton;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void initialize() {

        ButtonIn.setOnAction(actionEvent -> {
            String loginText = login_field.getText().trim(); // trim удаляет лишние пробелы в строке
            String loginPassword = password_field.getText().trim(); // trim удаляет лишние пробелы в строке

            if(!loginText.equals("") && !loginPassword.equals("")) {
                loginUser(loginText, loginPassword);
            } else
                System.out.println("Login and password is empty");
            RegisterButton.setOnAction(actionEvent1 -> {
               openNewScene("/sample/demo/sighUp.fxml");
            });
        });

        RegisterButton.setOnAction(actionEvent -> {        //функционал кнопки регитсрации
            RegisterButton.getScene().getWindow().hide(); // прячет текущее окно

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/demo/sighUp.fxml")); // указывается путь к окну, которое нужно открыть

            try{                           //проверка исключения
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot(); // берет путь к окну
            Stage stage = new Stage();
            stage.setScene(new Scene(root));     // для того чтобы отобразить нужное окно
            stage.show();
        });

    }

    private void loginUser(String loginText, String loginPassword) {
        DataBaseHandler dbHandler = new DataBaseHandler();
        User user = new User();
        user.setUsername(loginText);
        user.setPassword(loginPassword);
        dbHandler.getUser(user);

        ResultSet result = dbHandler.getUser(user);

        int counter = 0;


        try {
            while(result.next()) {
                counter++;
            }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        if(counter >= 1){
            openNewScene("/sample/demo/app.fxml");
        } else{
            Shake userLoginAnim = new Shake(login_field);
            Shake userPasswordAnim = new Shake(password_field);
            userLoginAnim.PlayAnim();
            userPasswordAnim.PlayAnim();
        }
    }

    public void openNewScene(String window){
        RegisterButton.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try{                           //проверка исключения
            loader.load();
        } catch (IOException e){
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}

