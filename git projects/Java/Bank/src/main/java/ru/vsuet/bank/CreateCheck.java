package ru.vsuet.bank;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class CreateCheck {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button createCheckButton;

    private String userId;

    @FXML
    void initialize() {
        createCheckButton.setOnAction(actionEvent -> {
            DBHandler dbHandler = new DBHandler();
            String query = "select * from " + Const.USERS_TABLE;
            try {
                Statement statement = dbHandler.getConnection().createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while(resultSet.next()){
                    userId = resultSet.getString("idusers");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(userId);
        });
    }

}
