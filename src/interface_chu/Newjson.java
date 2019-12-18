/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_chu;
import java.io.FileOutputStream;
import java.util.HashMap;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonWriter;
    
/**
 *
 * @author Utilisateur
 */
public class Newjson  {
   @FXML private Label nomfichiers;
   private HashMap<String, HashMap<String, String>>listeJson;
   public static void createjson()throws Exception {
       
        HashMap<String, String>innerMap = new HashMap<>();
       
        JsonArray value = Json.createArrayBuilder()
         
         .add(Json.createObjectBuilder()
          
         .add("test1", "1001")
         .add("TEST2", "1002"))
         .add(Json.createObjectBuilder()
         .add("id", "1002")
         .add("id2", "1003"))
         .build();
      System.out.println(value);
      JsonWriter writer = Json.createWriter(new FileOutputStream("sampleData"));
      writer.writeArray(value);
      writer.close();
   }
}
