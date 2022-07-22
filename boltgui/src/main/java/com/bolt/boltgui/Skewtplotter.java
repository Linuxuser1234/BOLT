/*
/Copyright (c) [2022] [Christian Gaskins]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 * !!DO NOT SELL CODE THIS CODE IS OPEN SOURCE AND WILL STAY THAT WAY!!
*/
package com.bolt.boltgui;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.util.Objects;
public class
Skewtplotter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static <T> T getResource(String s) {
        return null;
    }

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Skewtplotter.fxml")));
        Scene scene = new Scene(root);
        stage.setTitle("Skew-t log p Plotting Selection Interface v1.0");
        stage.setScene(scene);
        stage.setMaximized(false);
        stage.setResizable(false);

        stage.show();
    }

}