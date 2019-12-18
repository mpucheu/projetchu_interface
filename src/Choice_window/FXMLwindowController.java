/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Choice_window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Utilisateur
 */
public class FXMLwindowController implements Initializable {
       
    @FXML private Button replay;
      /**
     * fonction pour choisir de continuer sur un ancien JSON ou créer un nouveau
     */
    @FXML
   public void choix1() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interface_chu/FXMLDocument.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
        Stage stage2 = (Stage) replay.getScene().getWindow();
        stage2.close();
    }

      public void choix2() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interface_chu/FXMLDocument.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
        Stage stage3 = (Stage) replay.getScene().getWindow();
        stage3.close();
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
