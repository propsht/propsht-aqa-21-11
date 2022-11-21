module com.example.hillel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hillel to javafx.fxml;
    exports com.example.hillel;
}