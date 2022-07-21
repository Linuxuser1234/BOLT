module com.bolt.boltgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bolt.boltgui to javafx.fxml;
    exports com.bolt.boltgui;
}