module com.mesterakos {
    requires javafx.controls;
    requires javafx.fxml;

    opens controllers to javafx.fxml;
    exports controllers;
}