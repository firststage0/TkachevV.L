package service;

import repository.DBHandler;
import settings.Const;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCheckService{
    private static Long userId;
    private static String Search;

    protected static void CreateCheck(String checkName, String loginText){
        DBHandler dbHandler = new DBHandler();
        String query = "select * from " + Const.USERS_TABLE;
        try {
            Statement statement = dbHandler.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                Search = resultSet.getString("username");
                if(Search.equals(loginText)){
                    userId = resultSet.getLong("idusers");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        String insert = "insert into " + Const.ACCOUNTS_TABLE + "(" + Const.ACCOUNTS_ID + "," + Const.ACCOUNTS_CHEK +
                "," + Const.ACCOUNTS_MONEY + ") values(?,?,?)";
        try {
            PreparedStatement prst = dbHandler.getConnection().prepareStatement(insert);
            prst.setString(1, String.valueOf(userId));
            prst.setString(2, checkName);
            prst.setString(3, String.valueOf(0));

            prst.executeUpdate();
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        System.out.println(userId);
    }
}
