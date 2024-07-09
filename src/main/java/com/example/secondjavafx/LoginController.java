package com.example.secondjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
public class LoginController {
    @FXML
    public TextField usernameText;
    @FXML
    public PasswordField passwordText;

    @FXML
    public Label registerLabel;


    @FXML
    protected void onSubmitButtonClick() {
        String username = usernameText.getText();
        String password = passwordText.getText();

        if (username.isEmpty() && password.isEmpty()) {
            registerLabel.setText("Please fill all the fields!!");
        }
    }
}