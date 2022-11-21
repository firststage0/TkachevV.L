package ru.vsuet.bank;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class AppMain extends Controller{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text UserAccountName;

    @FXML
    void initialize() {

        String loginTab = loginText;
       UserAccountName.setText(loginTab);
        System.out.println(loginTab);
    }

}
