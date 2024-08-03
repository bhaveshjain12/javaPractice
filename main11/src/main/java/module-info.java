module com.example.main11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.main11 to javafx.fxml;
    exports com.example.main11;
}