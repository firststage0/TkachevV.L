module ru.vsuet.bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;
    requires java.desktop;
    requires javafx.graphics;


    opens ru.vsuet.bank to javafx.fxml;
    exports ru.vsuet.bank;
    exports repository;
    opens repository to javafx.fxml;
    exports settings;
    opens settings to javafx.fxml;
}