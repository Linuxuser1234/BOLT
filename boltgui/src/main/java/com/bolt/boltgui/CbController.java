//Copyright (c) [2022] [Christian Gaskins]
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
// * !!DO NOT SELL CODE THIS CODE IS OPEN SOURCE AND WILL STAY THAT WAY!!
package com.bolt.boltgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import java.net.URL;
import java.util.ResourceBundle;

public class CbController implements Initializable {

    @FXML
    private ComboBox<String> GEC;
    @FXML
    private ComboBox<String> GEFD;
    @FXML
    private ComboBox<String> GEM1;
    @FXML
    private ComboBox<String> GEM2;
    @FXML
    private ComboBox<String> GWC;
    @FXML
    private ComboBox<String> GWFD;
    @FXML
    private ComboBox<String> GWM1;
    @FXML
    private ComboBox<String> GWM2;
    @FXML
    void selection8(ActionEvent event) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        GEC.getItems().add("0.47 μm Blue Visible Band ch.01");
        GEC.getItems().add("0.64 μm Red Visible Band ch.02");
        GEC.getItems().add("0.86 μm Vegetation NIR Band ch.03");
        GEC.getItems().add("1.37 μm Cirrus NIR Band ch.04");
        GEC.getItems().add("1.61 μm Snow/Ice NIR Band ch.05");
        GEC.getItems().add("2.24 μm Cloud Particle Size NIR Band ch.06");
        GEC.getItems().add("3.90 μm Shortwave Window IR Band ch.07");
        GEC.getItems().add("6.19 μm Upper-Level Water Vapor IR Band ch.08");
        GEC.getItems().add("6.93 μm Mid-Level Water Vapor IR Band ch.09");
        GEC.getItems().add("7.34 μm Low-level Water Vapor IR Band ch.10");
        GEC.getItems().add("8.44 μm Cloud-Top Phase IR Band ch.11");
        GEC.getItems().add("9.61 μm Ozone IR Band ch.12");
        GEC.getItems().add("10.33 μm Clean Window IR Band ch.13");
        GEC.getItems().add("11.21 μm Legacy Window IR Band ch.14");
        GEC.getItems().add("12.29 μm Dirty Window IR Band ch.15");
        GEC.getItems().add("13.28 μm Carbon Dioxide IR Band ch.16");

        GEFD.getItems().add("0.47 μm Blue Visible Band ch.01");
        GEFD.getItems().add("0.64 μm Red Visible Band ch.02");
        GEFD.getItems().add("0.86 μm Vegetation NIR Band ch.03");
        GEFD.getItems().add("1.37 μm Cirrus NIR Band ch.04");
        GEFD.getItems().add("1.61 μm Snow/Ice NIR Band ch.05");
        GEFD.getItems().add("2.24 μm Cloud Particle Size NIR Band ch.06");
        GEFD.getItems().add("3.90 μm Shortwave Window IR Band ch.07");
        GEFD.getItems().add("6.19 μm Upper-Level Water Vapor IR Band ch.08");
        GEFD.getItems().add("6.93 μm Mid-Level Water Vapor IR Band ch.09");
        GEFD.getItems().add("7.34 μm Low-level Water Vapor IR Band ch.10");
        GEFD.getItems().add("8.44 μm Cloud-Top Phase IR Band ch.11");
        GEFD.getItems().add("9.61 μm Ozone IR Band ch.12");
        GEFD.getItems().add("10.33 μm Clean Window IR Band ch.13");
        GEFD.getItems().add("11.21 μm Legacy Window IR Band ch.14");
        GEFD.getItems().add("12.29 μm Dirty Window IR Band ch.15");
        GEFD.getItems().add("13.28 μm Carbon Dioxide IR Band ch.16");

        GEM1.getItems().add("0.47 μm Blue Visible Band ch.01");
        GEM1.getItems().add("0.64 μm Red Visible Band ch.02");
        GEM1.getItems().add("0.86 μm Vegetation NIR Band ch.03");
        GEM1.getItems().add("1.37 μm Cirrus NIR Band ch.04");
        GEM1.getItems().add("1.61 μm Snow/Ice NIR Band ch.05");
        GEM1.getItems().add("2.24 μm Cloud Particle Size NIR Band ch.06");
        GEM1.getItems().add("3.90 μm Shortwave Window IR Band ch.07");
        GEM1.getItems().add("6.19 μm Upper-Level Water Vapor IR Band ch.08");
        GEM1.getItems().add("6.93 μm Mid-Level Water Vapor IR Band ch.09");
        GEM1.getItems().add("7.34 μm Low-level Water Vapor IR Band ch.10");
        GEM1.getItems().add("8.44 μm Cloud-Top Phase IR Band ch.11");
        GEM1.getItems().add("9.61 μm Ozone IR Band ch.12");
        GEM1.getItems().add("10.33 μm Clean Window IR Band ch.13");
        GEM1.getItems().add("11.21 μm Legacy Window IR Band ch.14");
        GEM1.getItems().add("12.29 μm Dirty Window IR Band ch.15");
        GEM1.getItems().add("13.28 μm Carbon Dioxide IR Band ch.16");

        GEM2.getItems().add("0.47 μm Blue Visible Band ch.01");
        GEM2.getItems().add("0.64 μm Red Visible Band ch.02");
        GEM2.getItems().add("0.86 μm Vegetation NIR Band ch.03");
        GEM2.getItems().add("1.37 μm Cirrus NIR Band ch.04");
        GEM2.getItems().add("1.61 μm Snow/Ice NIR Band ch.05");
        GEM2.getItems().add("2.24 μm Cloud Particle Size NIR Band ch.06");
        GEM2.getItems().add("3.90 μm Shortwave Window IR Band ch.07");
        GEM2.getItems().add("6.19 μm Upper-Level Water Vapor IR Band ch.08");
        GEM2.getItems().add("6.93 μm Mid-Level Water Vapor IR Band ch.09");
        GEM2.getItems().add("7.34 μm Low-level Water Vapor IR Band ch.10");
        GEM2.getItems().add("8.44 μm Cloud-Top Phase IR Band ch.11");
        GEM2.getItems().add("9.61 μm Ozone IR Band ch.12");
        GEM2.getItems().add("10.33 μm Clean Window IR Band ch.13");
        GEM2.getItems().add("11.21 μm Legacy Window IR Band ch.14");
        GEM2.getItems().add("12.29 μm Dirty Window IR Band ch.15");
        GEM2.getItems().add("13.28 μm Carbon Dioxide IR Band ch.16");

        GWC.getItems().add("0.47 μm Blue Visible Band ch.01");
        GWC.getItems().add("0.64 μm Red Visible Band ch.02");
        GWC.getItems().add("0.86 μm Vegetation NIR Band ch.03");
        GWC.getItems().add("1.37 μm Cirrus NIR Band ch.04");
        GWC.getItems().add("1.61 μm Snow/Ice NIR Band ch.05");
        GWC.getItems().add("2.24 μm Cloud Particle Size NIR Band ch.06");
        GWC.getItems().add("3.90 μm Shortwave Window IR Band ch.07");
        GWC.getItems().add("6.19 μm Upper-Level Water Vapor IR Band ch.08");
        GWC.getItems().add("6.93 μm Mid-Level Water Vapor IR Band ch.09");
        GWC.getItems().add("7.34 μm Low-level Water Vapor IR Band ch.10");
        GWC.getItems().add("8.44 μm Cloud-Top Phase IR Band ch.11");
        GWC.getItems().add("9.61 μm Ozone IR Band ch.12");
        GWC.getItems().add("10.33 μm Clean Window IR Band ch.13");
        GWC.getItems().add("11.21 μm Legacy Window IR Band ch.14");
        GWC.getItems().add("12.29 μm Dirty Window IR Band ch.15");
        GWC.getItems().add("13.28 μm Carbon Dioxide IR Band ch.16");

        GWFD.getItems().add("0.47 μm Blue Visible Band ch.01");
        GWFD.getItems().add("0.64 μm Red Visible Band ch.02");
        GWFD.getItems().add("0.86 μm Vegetation NIR Band ch.03");
        GWFD.getItems().add("1.37 μm Cirrus NIR Band ch.04");
        GWFD.getItems().add("1.61 μm Snow/Ice NIR Band ch.05");
        GWFD.getItems().add("2.24 μm Cloud Particle Size NIR Band ch.06");
        GWFD.getItems().add("3.90 μm Shortwave Window IR Band ch.07");
        GWFD.getItems().add("6.19 μm Upper-Level Water Vapor IR Band ch.08");
        GWFD.getItems().add("6.93 μm Mid-Level Water Vapor IR Band ch.09");
        GWFD.getItems().add("7.34 μm Low-level Water Vapor IR Band ch.10");
        GWFD.getItems().add("8.44 μm Cloud-Top Phase IR Band ch.11");
        GWFD.getItems().add("9.61 μm Ozone IR Band ch.12");
        GWFD.getItems().add("10.33 μm Clean Window IR Band ch.13");
        GWFD.getItems().add("11.21 μm Legacy Window IR Band ch.14");
        GWFD.getItems().add("12.29 μm Dirty Window IR Band ch.15");
        GWFD.getItems().add("13.28 μm Carbon Dioxide IR Band ch.16");

        GWM1.getItems().add("0.47 μm Blue Visible Band ch.01");
        GWM1.getItems().add("0.64 μm Red Visible Band ch.02");
        GWM1.getItems().add("0.86 μm Vegetation NIR Band ch.03");
        GWM1.getItems().add("1.37 μm Cirrus NIR Band ch.04");
        GWM1.getItems().add("1.61 μm Snow/Ice NIR Band ch.05");
        GWM1.getItems().add("2.24 μm Cloud Particle Size NIR Band ch.06");
        GWM1.getItems().add("3.90 μm Shortwave Window IR Band ch.07");
        GWM1.getItems().add("6.19 μm Upper-Level Water Vapor IR Band ch.08");
        GWM1.getItems().add("6.93 μm Mid-Level Water Vapor IR Band ch.09");
        GWM1.getItems().add("7.34 μm Low-level Water Vapor IR Band ch.10");
        GWM1.getItems().add("8.44 μm Cloud-Top Phase IR Band ch.11");
        GWM1.getItems().add("9.61 μm Ozone IR Band ch.12");
        GWM1.getItems().add("10.33 μm Clean Window IR Band ch.13");
        GWM1.getItems().add("11.21 μm Legacy Window IR Band ch.14");
        GWM1.getItems().add("12.29 μm Dirty Window IR Band ch.15");
        GWM1.getItems().add("13.28 μm Carbon Dioxide IR Band ch.16");

        GWM2.getItems().add("0.47 μm Blue Visible Band ch.01");
        GWM2.getItems().add("0.64 μm Red Visible Band ch.02");
        GWM2.getItems().add("0.86 μm Vegetation NIR Band ch.03");
        GWM2.getItems().add("1.37 μm Cirrus NIR Band ch.04");
        GWM2.getItems().add("1.61 μm Snow/Ice NIR Band ch.05");
        GWM2.getItems().add("2.24 μm Cloud Particle Size NIR Band ch.06");
        GWM2.getItems().add("3.90 μm Shortwave Window IR Band ch.07");
        GWM2.getItems().add("6.19 μm Upper-Level Water Vapor IR Band ch.08");
        GWM2.getItems().add("6.93 μm Mid-Level Water Vapor IR Band ch.09");
        GWM2.getItems().add("7.34 μm Low-level Water Vapor IR Band ch.10");
        GWM2.getItems().add("8.44 μm Cloud-Top Phase IR Band ch.11");
        GWM2.getItems().add("9.61 μm Ozone IR Band ch.12");
        GWM2.getItems().add("10.33 μm Clean Window IR Band ch.13");
        GWM2.getItems().add("11.21 μm Legacy Window IR Band ch.14");
        GWM2.getItems().add("12.29 μm Dirty Window IR Band ch.15");
        GWM2.getItems().add("13.28 μm Carbon Dioxide IR Band ch.16");

    }
}

