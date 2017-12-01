/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author A456U
 */
public class HomeController implements Initializable {

    @FXML
    private JFXButton se;
    @FXML
    private JFXButton ra;
    @FXML
    private JFXButton ka;
    @FXML
    private JFXButton ju;
    @FXML
    private JFXButton sa;
    @FXML
    private JFXButton sl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void se(ActionEvent event) throws IOException {
        ( (Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("senin.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 624, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
    }

    @FXML
    private void ra(ActionEvent event) throws IOException {
        ( (Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("rabu.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 624, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
    }

    @FXML
    private void ka(ActionEvent event) throws IOException {
        ( (Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("kamis.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 624, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
    }

    @FXML
    private void ju(ActionEvent event) throws IOException {
        ( (Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("jumat.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 624, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
    }

    @FXML
    private void sa(ActionEvent event) throws IOException {
        ( (Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("sabtu.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 624, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
    }

    @FXML
    private void sl(ActionEvent event) throws IOException {
        ( (Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("selasa.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 624, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
    }
    
}
