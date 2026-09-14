module com.example.calenderproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calenderproject to javafx.fxml;
    exports com.example.calenderproject;
}