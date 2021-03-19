package loginapp;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {
    //once you initialize something you need a method

    @FXML // this is to access the FXML file where we can access the label for example and control it from here
    private Label dbstatus;

    LoginModel loginModel = new LoginModel();

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private ComboBox<option>comboBox;

    @FXML
    private Button loginButton;

    public void initialize(URL url, ResourceBundle rb) {

        if(this.loginModel.isDatabaseConnected()) {
            this.dbstatus.setText("Connected to Database");
        }else {
            this.dbstatus.setText("Not Connected to Database");
        }
                                                                // this calls the values from the Enum
        this.comboBox.setItems(FXCollections.observableArrayList(option.values()));
    }
}
