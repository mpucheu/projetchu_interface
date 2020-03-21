/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Choice_window;

import com.google.gson.Gson;
import interface_chu.FXMLDocumentController;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * PUCHEU Marion
 * MARLIAT Julien
 */
 
public class FXMLwindowController implements Initializable {
    
    @FXML private Button replay;
    private boolean replayok; 
    private Stage stage;

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
      /**
     * fonction pour choisir de continuer sur un ancien JSON ou créer un nouveau
     */
     @FXML
     
    // methode avec le boutton replay
      public void choix1() throws Exception {
       
        
     // Lecture du json et remplissage d'une hasmap
     // a remplacer le getpath
     FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Select files");
                fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Json files(*.json)", "*.json"));
                File filesJson = fileChooser.showOpenDialog(stage);
        BufferedReader reader = new BufferedReader(new FileReader(new File((filesJson.getPath()))));
        Map<String, Object> map = new Gson().fromJson(reader, HashMap.class);
        System.out.println(map);
        replayok = true;
        // chargement interface avec Hmap pré rempli
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/interface_chu/FXMLDocument.fxml"));
        loader.setControllerFactory((Class<?> controllertype) -> {
        if (controllertype==FXMLDocumentController.class){
            FXMLDocumentController controller = new FXMLDocumentController();
            controller.setReplayok(replayok);
            controller.setListeModules(map);
            return controller;  
        }
        else{
        try{
            return controllertype.newInstance();
        } catch(Exception g){
        throw new RuntimeException(g);
        }}});
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage= new Stage();
        stage.setScene(scene);
        
        stage.show();
        Stage stage2 = (Stage) replay.getScene().getWindow();
        stage2.close();
       
     }
     
     
     
     // methode avec le boutton new analysis
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
