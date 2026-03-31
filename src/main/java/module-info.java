module org.example.studenta {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.studenta to javafx.fxml;
    exports org.example.studenta;
}

