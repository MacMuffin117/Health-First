module com.group4.healthfirst {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.group4.healthfirst to javafx.fxml;
    exports com.group4.healthfirst;
}