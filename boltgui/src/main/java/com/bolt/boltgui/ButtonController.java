/*
//Copyright (c) [2022] [Christian Gaskins]

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
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.stage.*;
public class ButtonController implements Initializable {
    @FXML
    public Button Skewt;
    @FXML
    public Button Hodograph;
    @FXML
    public Button Settings;
    @FXML
    public Canvas canvas;

    private ActionEvent event;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML

    private void Skewt(ActionEvent event) throws IOException {
        Parent SkewtParent = FXMLLoader.load(Objects.requireNonNull(Skewtplotter.class.getResource("/com/bolt/boltgui/Skewtplotter.fxml")));
        Scene Scene = new Scene(SkewtParent);
        Stage popup = new Stage();
        popup.setScene(Scene);
        popup.setTitle("Skew-t log p Plotting Selection Interface v1.0");
        popup.setScene(Scene);
        popup.setMaximized(false);
        popup.setResizable(false);
        popup.show();

    }
    @FXML
    private void Hodograph(ActionEvent event) throws IOException {
        Parent HodographParent = FXMLLoader.load(Objects.requireNonNull(Hodographplotter.class.getResource("/com/bolt/boltgui/Hodographplotter.fxml")));
        Scene Scene = new Scene(HodographParent);
        Stage popup = new Stage();
        popup.setScene(Scene);
        popup.setTitle("Hodograph Plotting Selection Interface v1.0");
        popup.setScene(Scene);
        popup.setMaximized(false);
        popup.setResizable(false);
        popup.show();

    }

    @FXML
    private void GOES(ActionEvent event) throws IOException {
        Parent GoeschooserParent = FXMLLoader.load(Objects.requireNonNull(Hodographplotter.class.getResource("/com/bolt/boltgui/Goeschooser.fxml")));
        Scene Scene = new Scene(GoeschooserParent);
        Stage popup = new Stage();
        popup.setScene(Scene);
        popup.setTitle("G.O.E.S Plotting Selection Interface v1.0");
        popup.setScene(Scene);
        popup.setMaximized(false);
        popup.setResizable(false);
        popup.show();

    }

    @FXML
    private void Settings(ActionEvent event) throws IOException {
        Parent SettingsParent = FXMLLoader.load(Objects.requireNonNull(Settings.class.getResource("/com/bolt/boltgui/Settings.fxml")));
        Scene Scene = new Scene(SettingsParent);
        Stage popup = new Stage();
        popup.setScene(Scene);
        popup.setTitle("BOLT Core Settings Interface v1.0");
        popup.setScene(Scene);
        popup.setMaximized(false);
        popup.setResizable(false);
        popup.show();

    }
}

