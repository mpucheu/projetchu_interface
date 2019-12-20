/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_chu;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import static java.util.stream.DoubleStream.builder;
import static java.util.stream.IntStream.builder;
import static java.util.stream.LongStream.builder;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.Writer;

/**
 *.
 * @author Utilisateur
 */
public class Newjson  {
  
   public static void createjson(HashMap<String,Object> liste )throws Exception {
  
       try (Writer writer = new FileWriter("Output.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(liste, writer);
        }
       
       
   }
   public static void enregistreHashMap(HashMap<String, HashMap<String, String>> liste, String listePath) throws FileNotFoundException {
      
   
      //System.out.println(liste);
      JsonObjectBuilder builder = Json.createObjectBuilder();
      builder.add("fastq",listePath);
      for (Entry<String, HashMap<String, String>> entry : liste
		        .entrySet()) {
			JsonObjectBuilder childBuilder = Json
			        .createObjectBuilder();
			for (Entry<String, String> entryChild : entry
			        .getValue().entrySet()) {
				childBuilder.add(entryChild.getKey(),
				        entryChild.getValue());
			}
			builder.add(entry.getKey(), childBuilder);
		}
		JsonObject doc = builder.build();

                
                
		System.out.println("javaxjson2()");
		System.out.println(doc.toString());
                
                JsonWriter writer = Json.createWriter(new FileOutputStream("coucou.json"));
      writer.writeObject(doc);
      writer.close();
  
}
   
}
