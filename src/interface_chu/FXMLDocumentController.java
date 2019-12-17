/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_chu;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.DepthTest;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Utilisateur
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML final FileChooser fileChooser = new FileChooser();
    
    private ToggleGroup monGroupe;
    @FXML private RadioButton microbiome, resistome;
    @FXML private Button fichier;
    @FXML private Button classifier;
    @FXML private Button meta;
    @FXML private Button resu;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;
   
    @FXML private CheckBox variant_prema;
    @FXML private CheckBox variant_callvar;
    @FXML private CheckBox variant_merge;
    @FXML private CheckBox variant_gentable;
    @FXML private CheckBox variant_genref;
    @FXML private CheckBox rarefy;
    @FXML private CheckBox phylogeny_iqtre;
    @FXML private CheckBox diversity_alpha;
    @FXML private CheckBox alpha_group_significance;
    @FXML private CheckBox diversity_beta;
    @FXML private CheckBox beta_group_significance;
    @FXML private CheckBox emperor_plot;
    @FXML private CheckBox alpha_rarefaction;
    @FXML private CheckBox classify_sklearn;
    @FXML private CheckBox filter_samples;
    @FXML private CheckBox taxa_collapse;
    @FXML private CheckBox filter_features;
    @FXML private CheckBox ancom;
    @FXML private CheckBox export_trimmed;
    @FXML private CheckBox classify_samples_ncv;
    @FXML private CheckBox picrust2_pipeline;
    @FXML private CheckBox picrust2_import;
    @FXML private CheckBox export_table;
    @FXML private CheckBox stats_depth;
    @FXML private CheckBox lefse;
    @FXML private CheckBox humann2_merge;
    @FXML private CheckBox masslin2;
    @FXML private CheckBox humann2;
    
    @FXML private Text nomModule;
    @FXML private Text para1;
    @FXML private Text para2;
    @FXML private Text para3;
    @FXML private Text para4;
    @FXML private Text para5;
    @FXML private Text frontforward;
    @FXML private Text frontreverse;
    
    
    @FXML private TextField le1;
    @FXML private TextField le2;
    @FXML private TextField le3;
    @FXML private TextField le4;
    @FXML private TextField le5;
    @FXML private TextField frontforwardtxt;
    @FXML private TextField frontreversetxt;
    
    @FXML private TextArea ctrl;
    
    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;
    @FXML private Label label4;
    @FXML private Label label5;
    @FXML private Label classif;
    @FXML private Label nomfichiers;
    @FXML private Label fmeta; 
    @FXML private Label fresu;
    
    @FXML private AnchorPane paneDetails;
    
    private String valueModule;
    
    private String min_sampling_depth;
    private HashMap<String, HashMap<String, String>> listeModules;
    
    private int nbrR1=0;
    private int nbrR2=0;
    
    
    /**
     * fonction qui appelle le hashmap quand on clique sur ajouter
     */
    @FXML
    public void handleClickSave(ActionEvent event){
        HashMap<String, String>innerMap = new HashMap<>();
        switch (valueModule){
            case "rarefy" :
                innerMap.put("to_do", "1");
                String val = le5.getText();
                innerMap.put("min_sampling_depth", val);
                listeModules.put("rarefy", innerMap);
                break;
            
            case "phylogeny_iqtree" :
                innerMap.put("to_do", "1");
                innerMap.put("mode", le1.getText());
                innerMap.put("perturb_nni_strength", le3.getText());
                innerMap.put("stop_iter", le5.getText());
                innerMap.put("bootstrap_replicates", le2.getText());
                innerMap.put("n_cores", le4.getText());
                listeModules.put("phylogeny_iqtree", innerMap);
                break;
                
            case "alpha_rarefaction":
                innerMap.put("to_do", "1");
                innerMap.put("max_depth", le5.getText());
                listeModules.put("alpha_rarefaction", innerMap);
                break;
                
            case "humann2":
                innerMap.put("to_do", "1");
                innerMap.put("pathways", label5.getText());
                innerMap.put("nucleotide_database", label1.getText());
                innerMap.put("protein_database", label2.getText());
                listeModules.put("humann2", innerMap);
                break;
                
            case "classify_sklearn":
                innerMap.put("to_do", "1");
                innerMap.put("nucleotide_database", le5.getText());
                listeModules.put("classify_sklearn", innerMap);
                break;
                
            case "variant_callvar":
                innerMap.put("to_do", "1");
                innerMap.put("min_freq", le3.getText());
                innerMap.put("min_mapping_quality", le1.getText());
                innerMap.put("min_base_quality", le2.getText());
                innerMap.put("min_depth", le3.getText());
                listeModules.put("variant_callvar", innerMap);
                break;
                
            default : 
                break;
        }
        System.out.println(listeModules);
    }
    
    
    
    /* Recuperation des fichiers fastQ*/
    public void handleButtonAction(ActionEvent event) {
        //  nomfichiers.clear(); MARCHE PAS POUR UN TEXT
                Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("SELECTIONNER LES FICHIERS FASTQ");
                List<File> files = fileChooser.showOpenMultipleDialog(stage);
                System.out.println(files);
                printLog(files);
                if(nbrR1!=nbrR2){
                    this.ctrl.setText("ERROR"); 
                    this.ctrl.setStyle("-fx-font-weight: bold ;-fx-text-fill:red;-fx-background-color:#e81212;"); 
                }
                if(nbrR1==nbrR2){
                    this.ctrl.setText("OK");
                    this.ctrl.setStyle("-fx-font-weight: bold ;-fx-text-fill:green; -fx-background-color:#38ee00;");
                }
            }
     
    public void printLog( List<File> files) {

        for (File file : files) {
            
            this.nomfichiers.setText(this.nomfichiers.getText()+file.getPath()+"\n");
            if (file.getPath().contains("L001_R2")){
                nbrR2 = nbrR2+1;
            }else if (file.getPath().contains("L001_R1")){
                nbrR1 = nbrR1+1;
            }
        }        
    }
    
     /* Recuperation des METADATA patients*/
        @FXML
    public void handleButtonAction3(ActionEvent event) {
        //  nomfichiers.clear(); MARCHE PAS POUR UN TEXT
                Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Select patient data");
                List<File> files = fileChooser.showOpenMultipleDialog(stage);
                System.out.println(files);  
                printdata(files);
                }
    
     public void printdata( List<File> files) {

        for (File file : files) {
            
            this.fmeta.setText(this.fmeta.getText()+file.getPath()+"\n");
        }         
    }
     /* Recuperation des resultats*/
             @FXML
    public void handleButtonAction4(ActionEvent event) {
        //  nomfichiers.clear(); MARCHE PAS POUR UN TEXT
                Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Select result");
                List<File> files = fileChooser.showOpenMultipleDialog(stage);
                System.out.println(files);  
                printresu(files);
                }
    public void printresu( List<File> files) {

        for (File file : files) {
            
            this.fresu.setText(this.fresu.getText()+file.getPath()+"\n");
        }       
    }
     /* Recuperation des fichiers classifier*/
    @FXML
    public void handleButtonAction2(ActionEvent event) {
        //  nomfichiers.clear(); MARCHE PAS POUR UN TEXT
                Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Select otus");
                List<File> files = fileChooser.showOpenMultipleDialog(stage);
                System.out.println(files);  
                printLog2(files);
                }
     public void printLog2( List<File> files) {

        for (File file : files) {
            
            this.classif.setText(this.classif.getText()+file.getPath()+"\n");

        }    
    }
    
    @FXML
    public void handleBoutonDirectory(ActionEvent event) {
        DirectoryChooser directoryChooser = new DirectoryChooser(); 
        directoryChooser.setTitle("Select files");
        //Show open file dialog

        File file = directoryChooser.showDialog(null);
        Button val = (Button) event.getSource();
        String id = val.getId();
       
        if(file!=null){
            if(id.equals("button1")){
                label1.setText(file.getPath());
            }else if (id.equals("button2")){
                label2.setText(file.getPath());
            }else if(id.equals("button3")){
                label3.setText(file.getPath());
            }else if(id.equals("button4")){
                label4.setText(file.getPath());
            }else{
                label5.setText(file.getPath());
            }

        }
    }

    
    /*
    * fonction qui affiche les parametres si on coche variant_callvar
    */
    @FXML
    public void handleClickVariantCallvar(ActionEvent event){
        clearAfterFunction();
        if (variant_callvar.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("VARIANT CALLVAR");
            set5(true);
            para3.setText("min_freq");
            para1.setText("min_mapping_quality");
            para2.setText("min_base_quality");
            para4.setText("min_depth");
            valueModule="variant_callvar";
            if (listeModules.containsKey("variant_callvar")){
                le3.setText(listeModules.get("variant_callvar").get("min_freq"));
                le1.setText(listeModules.get("variant_callvar").get("min_mapping_quality"));
                le2.setText(listeModules.get("variant_callvar").get("min_base_quality"));
                le4.setText(listeModules.get("variant_callvar").get("min_depth"));
            }
        }else{
            paneDetails.setVisible(false);
            set1(false);
            set2(false);
            set3(false);
            set4(false);
            valueModule="";
            listeModules.remove("variant_callvar");
            le5.clear();
        }
    }
    
    /*
    * fonction qui affiche les parametres si on coche classify_sklearn
    */
    @FXML
    public void handleClickClassifySKLearn(ActionEvent event){
        clearAfterFunction();
        if (classify_sklearn.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("CLASSIFY SKLEARN");
            set5(true);
            para5.setText("confidence");
            valueModule="classify_sklearn";
            if (listeModules.containsKey("classify_sklearn")){
                le5.setText(listeModules.get("classify_sklearn").get("confidence"));
            }
        }else{
            paneDetails.setVisible(false);
            set5(false);
            valueModule="";
            listeModules.remove("classify_sklearn");
            le5.clear();
        }
    }
    
    /*
    * fonction qui affiche les parametres si on coche alpha_rarefaction
    */
    @FXML
    public void handleClickAlphaRarefaction(ActionEvent event){
        clearAfterFunction();
        if (alpha_rarefaction.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("ALPHA RAREFACTION");
            set5(true);
            para5.setText("max_depth");
            valueModule="alpha_rarefaction";
            if (listeModules.containsKey("alpha_rarefaction")){
                le5.setText(listeModules.get("alpha_rarefaction").get("max_depth"));
            }
        }else{
            paneDetails.setVisible(false);
            set5(false);
            valueModule="";
            listeModules.remove("alpha_rarefaction");
            le5.clear();
        }
    }
    
    
    
    /*
    * fonction qui ajoute le stats_depth si coché
    */
    @FXML 
    public void handleClickStatDepth (ActionEvent event){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (stats_depth.isSelected()){
            HashMap<String, String>innerMap = new HashMap<>();
            innerMap.put("to_do", "1");
            listeModules.put("stats_depth", innerMap);
        }else{
            listeModules.remove("stats_depth");
        }
    }
    
    /*
    * fonction qui ajoute le export_trimmed si coché
    */
    @FXML 
    public void handleClickExportTable (ActionEvent event){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (export_table.isSelected()){
            HashMap<String, String>innerMap = new HashMap<>();
            innerMap.put("to_do", "1");
            listeModules.put("export_table", innerMap);
        }else{
            listeModules.remove("export_table");
        }
    }
    
    /*
    * fonction qui ajoute le export_trimmed si coché
    */
    @FXML 
    public void handleClickExportTrimmed (ActionEvent event){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (export_trimmed.isSelected()){
            HashMap<String, String>innerMap = new HashMap<>();
            innerMap.put("to_do", "1");
            listeModules.put("export_trimmed", innerMap);
        }else{
            listeModules.remove("export_trimmed");
        }
    }
    
    /*
    * fonction qui ajoute le picrust2_import si coché
    */
    @FXML 
    public void handleClickPicrust2Import (ActionEvent event){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (picrust2_import.isSelected()){
            HashMap<String, String>innerMap = new HashMap<>();
            innerMap.put("to_do", "1");
            listeModules.put("picrust2_import", innerMap);
        }else{
            listeModules.remove("picrust2_import");
        }
    }
    
    /*
    * fonction qui ajoute le picrust2_pipeline si coché
    */
    @FXML 
    public void handleClickPicrust2Pipeline (ActionEvent event){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (picrust2_pipeline.isSelected()){
            HashMap<String, String>innerMap = new HashMap<>();
            innerMap.put("to_do", "1");
            listeModules.put("picrust2_pipeline", innerMap);
        }else{
            listeModules.remove("picrust2_pipeline");
        }
    }
    
    /*
    * fonction qui ajoute le alpha_group si coché
    */
    @FXML 
    public void handleClickAlphaGroup (ActionEvent event){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (alpha_group_significance.isSelected()){
            HashMap<String, String>innerMap = new HashMap<>();
            innerMap.put("to_do", "1");
            listeModules.put("alpha_group_significance", innerMap);
        }else{
            listeModules.remove("alpha_group_significance");
        }
    }
    
    /*
    fonction clique sur humann2
    */
    @FXML 
    public void handleClickHumann2(ActionEvent event){
        clearAfterFunction();
        if (humann2.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("HUMANN2");
            fich5(true);
            fich2(true);
            fich1(true);
            para1.setText("nucleotide_database");
            para5.setText("pathways");
            para2.setText("protein_database");
            valueModule="humann2";
            if (listeModules.containsKey("humann2")){
                le1.setText(listeModules.get("humann2").get("nucleotide_database"));
                le2.setText(listeModules.get("humann2").get("protein_database"));
                le5.setText(listeModules.get("humann2").get("pathways"));
            }
        }else{
            paneDetails.setVisible(false);
            fich5(false);
            fich2(false);
            fich1(false);
            valueModule="";
            listeModules.remove("humann2");
            clearAll();
            
        }
    }
    
    /*
    fonction clique sur phylogenic IQ tree
    */
    @FXML 
    public void handleClickIQTree(ActionEvent event){
        clearAfterFunction();
        if (phylogeny_iqtre.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("PHYLOGENY IQTREE");
            set5(true);
            set4(true);
            set3(true);
            set2(true);
            set1(true);
            para1.setText("mode");
            para3.setText("perturb_nni_strength");
            para5.setText("stop_iter");
            para2.setText("bootstrap_replicates");
            para4.setText("n_cores");
            valueModule="phylogeny_iqtree";
            if (listeModules.containsKey("phylogeny_iqtree")){
                le1.setText(listeModules.get("phylogeny_iqtree").get("mode"));
                le2.setText(listeModules.get("phylogeny_iqtree").get("bootstrap_replicates"));
                le3.setText(listeModules.get("phylogeny_iqtree").get("perturb_nni_strength"));
                le4.setText(listeModules.get("phylogeny_iqtree").get("n_cores"));
                le5.setText(listeModules.get("phylogeny_iqtree").get("stop_iter"));
            }
        }else{
            paneDetails.setVisible(false);
            set5(false);
            set4(false);
            set3(false);
            set2(false);
            set1(false);
            valueModule="";
            listeModules.remove("phylogeny_iqtree");
            clearAll();
            
        }
    }
    
    
    /**
     * gère le click sur checkbox rarefy
     */
    @FXML
    public void handleClickRarefy(ActionEvent event){
        clearAfterFunction();
        if (rarefy.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("RAREFY");
            set5(true);
            para5.setText("min_sampling_depth");
            valueModule="rarefy";
            if (listeModules.containsKey("rarefy")){
                le5.setText(listeModules.get("rarefy").get("min_sampling_depth"));
            }
        }else{
            paneDetails.setVisible(false);
            set5(false);
            valueModule="";
            listeModules.remove("rarefy");
            le5.clear();
        }
        System.out.println(listeModules);
    }
    

    
    /**
     * Fonction qui coche les checkbox de module en fonction du radio sélectionné.
     * Associe chaque module à l'analyse microbiome ou résistome.
     */
    @FXML 
    public void handleAppVariant(ActionEvent event) {
        if (resistome.isSelected()){
            frontreverse.setVisible(true);
            frontreversetxt.setVisible(true);
            frontforward.setVisible(true);
            frontforwardtxt.setVisible(true);
            variant_prema.setVisible(true);
            //variant_prema.setSelected(true);
            variant_callvar.setVisible(true);
            //variant_callvar.setSelected(true);
            variant_merge.setVisible(true);
            //variant_merge.setSelected(true);
            variant_gentable.setVisible(true);
            //variant_gentable.setSelected(true);
            variant_genref.setVisible(true);
            //variant_genref.setSelected(true);
            
            /*rarefy.setSelected(false);
            phylogeny_iqtre.setSelected(false);
            diversity_alpha.setSelected(false);
            alpha_group_significance.setSelected(false);
            diversity_beta.setSelected(false);
            beta_group_significance.setSelected(false);
            emperor_plot.setSelected(false);
            beta_group_significance.setSelected(false);
            emperor_plot.setSelected(false);
            alpha_rarefaction.setSelected(false);
            classify_sklearn.setSelected(false);
            filter_samples.setSelected(false);
            taxa_collapse.setSelected(false);
            classify_samples_ncv.setSelected(false);
            picrust2_pipeline.setSelected(false);
            picrust2_import.setSelected(false);
            export_table.setSelected(false);
            
            stats_depth.setSelected(false);
            humann2_merge.setSelected(false);
            humann2.setSelected(false);
            
            filter_features.setSelected(true);
            ancom.setSelected(true);
            export_trimmed.setSelected(true);
            lefse.setSelected(true);
            masslin2.setSelected(true);*/
            
            //listeModules.clear();
            
        }else{
            frontreverse.setVisible(false);
            frontreversetxt.setVisible(false);
            frontforward.setVisible(false);
            frontforwardtxt.setVisible(false);
            variant_prema.setVisible(false);
            //variant_prema.setSelected(false);
            variant_callvar.setVisible(false);
            //variant_callvar.setSelected(false);
            variant_merge.setVisible(false);
            //variant_merge.setSelected(false);
            variant_gentable.setVisible(false);
            //variant_gentable.setSelected(false);
            variant_genref.setVisible(false);
            //variant_genref.setSelected(false);
            
            /*rarefy.setSelected(true);
            phylogeny_iqtre.setSelected(true);
            diversity_alpha.setSelected(true);
            alpha_group_significance.setSelected(true);
            diversity_beta.setSelected(true);
            beta_group_significance.setSelected(true);
            emperor_plot.setSelected(true);
            beta_group_significance.setSelected(true);
            emperor_plot.setSelected(true);
            alpha_rarefaction.setSelected(true);
            classify_sklearn.setSelected(true);
            filter_samples.setSelected(true);
            taxa_collapse.setSelected(true);
            classify_samples_ncv.setSelected(true);
            picrust2_pipeline.setSelected(true);
            picrust2_import.setSelected(true);
            export_table.setSelected(true);
            
            stats_depth.setSelected(false);
            humann2_merge.setSelected(false);
            humann2.setSelected(false);
            
            filter_features.setSelected(true);
            ancom.setSelected(true);
            export_trimmed.setSelected(true);
            lefse.setSelected(true);
            masslin2.setSelected(true);*/
            
            
           /* HashMap<String, String>innerMap = new HashMap<>();
            innerMap.put("to_do", "1");
            innerMap.put("min_sampling_depth", "7500");
            System.out.println(innerMap);
            listeModules.put("rarefy", innerMap);*/
        }
       
    }
    
    public void clearAfterFunction(){
        clearAll();
        set5(false);
        set4(false);
        set3(false);
        set2(false);
        set1(false);
        fich1(false);
        fich2(false);
        fich3(false);
        fich4(false);
        fich5(false);
    }
    
    public void set5(Boolean val){
        para5.setVisible(val);
        le5.setVisible(val);
    }
    
    public void set4(Boolean val){
        para4.setVisible(val);
        le4.setVisible(val);
    }
    
    public void set3(Boolean val){
        para3.setVisible(val);
        le3.setVisible(val);
    }
    
    public void set2(Boolean val){
        para2.setVisible(val);
        le2.setVisible(val);
    }
    
    public void set1(Boolean val){
        para1.setVisible(val);
        le1.setVisible(val);
    }
    
    public void fich1(Boolean val){
        para1.setVisible(val);
        button1.setVisible(val);
        label1.setVisible(val);
    }
    
    public void fich2(Boolean val){
        para2.setVisible(val);
        button2.setVisible(val);
        label2.setVisible(val);
    }
    
    public void fich3(Boolean val){
        para3.setVisible(val);
        button3.setVisible(val);
        label3.setVisible(val);
    }
    
    public void fich4(Boolean val){
        para4.setVisible(val);
        button4.setVisible(val);
        label4.setVisible(val);
    }
    
    public void fich5(Boolean val){
        para5.setVisible(val);
        button5.setVisible(val);
        label5.setVisible(val);
    }
    
    public void clearAll(){
        le5.clear();
        le1.clear();
        le2.clear();
        le3.clear();
        le4.clear();
        label1.setText("");
        label2.setText("");
        label3.setText("");
        label4.setText("");
        label5.setText("");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        monGroupe = new ToggleGroup();
        monGroupe.getToggles().add(resistome);
        monGroupe.getToggles().add(microbiome);
        resistome.setSelected(true);
        listeModules = new HashMap<>();
        // TODO
    }    
    
}
