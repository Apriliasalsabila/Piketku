/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author A456U
 */
public class SeninController implements Initializable {

    @FXML
    private TextArea TA;
    @FXML
    private JFXTextField nama;
    @FXML
    private Button simpan;
    @FXML
    private Button hapus;
    @FXML
    private JFXTextField nama1;
    @FXML
    private JFXTextField nama2;
    @FXML
    private JFXTextField nama3;
    @FXML
    private JFXTextField nama4;
    @FXML
    private JFXTextField nama0;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void simpan(ActionEvent event) {
        String Nama0 = nama0.getText();
        String Nama = nama.getText();
        String Nama1 = nama1.getText();
        String Nama2 = nama2.getText();
        String Nama3 = nama3.getText();
        String Nama4 = nama4.getText();
        TA.setText(""+Nama0+"\n"+""+Nama+"\n"+""+Nama1+"\n"+""+Nama2+"\n"+""+Nama3+"\n"+""+Nama4+"\n"+"");
    }
    
    @FXML
    private void hps(ActionEvent event) {
        nama0.setText("");
        nama.setText("");
        nama1.setText("");
        nama2.setText("");
        nama3.setText("");
        nama4.setText("");
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        ( (Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("home.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 624, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Jadwal Piket");
                stage.show();
    }
    
}
