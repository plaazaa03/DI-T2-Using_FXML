package com.example.using_fxml_to_create_user_interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

public class FXMLExampleController {
    @FXML
    private Text actiontarget;
    @FXML
    private PasswordField passwordField;

    @FXML
    @Deprecated
    protected void handleSubmitButtonAction(ActionEvent event){
        actiontarget.setText("Sign in button pressed");
    }
}