module ru.vsuet.bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens ru.vsuet.bank to javafx.fxml;
    exports ru.vsuet.bank;
}