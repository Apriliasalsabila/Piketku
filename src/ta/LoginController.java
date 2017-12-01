/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author A456U
 */
public class LoginController implements Initializable {

    @FXML
    private JFXTextField user;
    @FXML
    private JFXPasswordField pass;
    String username, password;
    @FXML
    private JFXButton login;
    public String User="caca";
    public String Pass="123";
    @FXML
    private JFXButton back;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
    username=user.getText();
        password=pass.getText();
       // tampilUser.setText(username);
       // tampilPass.setText(password);
        
        if(username.equalsIgnoreCase(User) && password.equalsIgnoreCase(Pass)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("home.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 624, 450);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("LOGIN");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        ( (Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 624, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Login");
                stage.show();
    }
    
}
