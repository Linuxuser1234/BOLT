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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import java.net.URL;
import java.util.ResourceBundle;

public class HCBC implements Initializable {

    @FXML
    private ComboBox<String> Soundings;

    @FXML
    void Soundings(ActionEvent event) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Soundings.getItems().add("NAM");
        Soundings.getItems().add("NAMM");
        Soundings.getItems().add("GFS");
        Soundings.getItems().add("RAP");
        Soundings.getItems().add("SREF");
        Soundings.getItems().add("NAMmest");
        Soundings.getItems().add("HRRR");
        Soundings.getItems().add("BTV2");
        Soundings.getItems().add("GFS3");
        Soundings.getItems().add("FV3x");
        Soundings.getItems().add("FV3");

    }
}