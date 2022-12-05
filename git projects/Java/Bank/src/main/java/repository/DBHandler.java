package repository;

import settings.Config;

import java.sql.*;

public class DBHandler extends Config {
    private static Connection dbconnection;
    public Connection getConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?verifyServerCertificate=false" +
                "&useSSL=false" +
                "&requireSSL=false" +
                "&useLegacyDatetimeCode=false" +
                "&amp" +
                "&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbconnection = DriverManager.getConnection(connectionString, dbUser, dbpassword);
        return dbconnection;
    }

}
