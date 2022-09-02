package com.example.demo;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginController {
    @FXML
    public Label label1;
    @FXML
    public Label label2;
    @FXML
    public  Button button1;
    private Object Stage;

    @FXML
    public void OnButtonClicked(){

        label1.setText("跳转");

        HelloApplication app1 = new HelloApplication();

        Stage mystage = new Stage();

        try {
            app1.start(mystage); 
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
