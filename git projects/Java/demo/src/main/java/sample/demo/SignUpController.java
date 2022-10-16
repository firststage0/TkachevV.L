package sample.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField SighUpCountry;

    @FXML
    private TextField SighUpName;

    @FXML
    private Button SignUpButton;

    @FXML
    private CheckBox SignUpCheckBoxFemale;

    @FXML
    private CheckBox SignUpCheckBoxMale;

    @FXML
    private TextField SignUpSirName;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void initialize() {

        SignUpButton.setOnAction(actionEvent -> {
            SignUpNewUser();
        });
    }

    private void SignUpNewUser() {

        DataBaseHandler dataBaseHandler = new DataBaseHandler();

        String firstName = SighUpName.getText();
        String lastName = SignUpSirName.getText();
        String username = login_field.getText();
        String password = password_field.getText();
        String location = SighUpCountry.getText();
        String gender = "";
        if(SignUpCheckBoxMale.isSelected())
            gender = "Male";
        else
            gender = "Female";

        User user = new User(firstName, lastName, username, password, location, gender);

        dataBaseHandler.signUpUser(user);
    }

}

