package com.example.ikonli_maven;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import org.kordamp.ikonli.bootstrapicons.BootstrapIcons;
import org.kordamp.ikonli.bpmn.Bpmn;
import org.kordamp.ikonli.codicons.Codicons;
import org.kordamp.ikonli.javafx.FontIcon;

import org.kordamp.ikonli.bootstrapicons.BootstrapIcons.*;
import org.kordamp.ikonli.bpmn.Bpmn.*;
import org.kordamp.ikonli.codicons.Codicons.*;

public class HelloController {

    @FXML
    private Button btn_showicons;
    @FXML
    private FlowPane flw_Main;

    @FXML
    public void mShowIcons(ActionEvent actionEvent) {
        FontIcon icon1=new FontIcon("bi-alarm-fill"); //bootstrapicons
        FontIcon icon2=new FontIcon("bpmn-bpmn-io"); //Bpmn
        FontIcon icon3=new FontIcon("codicon-bell-dot"); //Codeicons

        icon1.setIconSize(70);
        icon2.setIconSize(70);
        icon3.setIconSize(70);

        Button button1=new Button();
        Button button2=new Button();
        Button button3=new Button();

        button1.setGraphic(icon1);
        button2.setGraphic(icon2);
        button3.setGraphic(icon3);

        button1.setMinSize(100,100);
        button2.setMinSize(100,100);
        button3.setMinSize(100,100);

        flw_Main.getChildren().add(button1);
        flw_Main.getChildren().add(button2);
        flw_Main.getChildren().add(button3);














    }
}