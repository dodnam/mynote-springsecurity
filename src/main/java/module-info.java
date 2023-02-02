module com.nam.mynotespringsecurity {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nam.mynotespringsecurity to javafx.fxml;
    exports com.nam.mynotespringsecurity;
}