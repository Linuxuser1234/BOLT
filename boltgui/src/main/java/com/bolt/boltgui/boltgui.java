
package com.bolt.boltgui;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.util.Objects;

public class boltgui extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Boltgui.fxml")));
        Scene scene = new Scene(root);
        root.getStylesheets().add(getClass().getResource("css/Canvascolor.css").toExternalForm());
        stage.setTitle("BOLT v1.0a POC");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}

