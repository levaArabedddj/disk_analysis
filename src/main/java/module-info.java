module com.example.disk_analysis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.disk_analysis to javafx.fxml;
    exports com.example.disk_analysis;
}