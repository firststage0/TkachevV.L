package service;

import repository.DBHandler;
import repository.Functions;
import ru.vsuet.bank.Const;
import ru.vsuet.bank.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegControllerService {

    protected static void SignUpNewUser(String username, String password, String firstname, String secondname) {
        Functions functions = new Functions();
        User user = new User(username, password, firstname, secondname);

        functions.signUpUser(user);
    }

    protected int IsUserAlreadyExists(String username){

        int count = 0;
        DBHandler dbHandler = new DBHandler();
        String query = "SELECT * FROM " + Const.USERS_TABLE;
        try {
            Statement statement = dbHandler.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println(count + " in try");
            while(resultSet.next()){
                String userSearch = resultSet.getString("username");
                if(userSearch.equals(username)){
                    count++;
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return count;
    }
}

