package coe528project;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Citizen Kane 
 */
public class loginController {
    @FXML 
    private TextField username;
    @FXML 
    private PasswordField password;
    /**
     * Initializes the controller class.
     * @param e
     * @throws java.io.IOException
     */
    User current;
    public void checkLogin(ActionEvent e) throws IOException {
        Main m = new Main();
        if ((username.getText().equals("admin"))&&(password.getText().equals("admin")))
            m.changeScene("owner-start-screen.fxml");
        else if (current.login(username.getText(), password.getText()))//having a bunch of problems with this see if it improves after users are implelemented
           m.changeScene("customer-start-screen.fxml");        
        else{
            Alert alert = new Alert (AlertType.ERROR);
            alert.setTitle("Wrong Login");
            alert.setHeaderText("Incorrect login info");
            alert.setContentText("You have entered the wrong username and/or password");
            
        }            
    }    
    
}

